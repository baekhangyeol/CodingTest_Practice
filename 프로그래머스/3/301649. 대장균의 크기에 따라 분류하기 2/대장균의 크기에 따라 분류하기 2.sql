WITH RankedEcoli AS (
    SELECT ID,
           SIZE_OF_COLONY,
           NTILE(4) OVER (ORDER BY SIZE_OF_COLONY DESC) AS Tile
    FROM ECOLI_DATA
)
SELECT ID,
       CASE
           WHEN Tile = 1 THEN 'CRITICAL'
           WHEN Tile = 2 THEN 'HIGH'
           WHEN Tile = 3 THEN 'MEDIUM'
           WHEN Tile = 4 THEN 'LOW'
       END AS COLONY_NAME
FROM RankedEcoli
ORDER BY ID;