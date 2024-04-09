SELECT RI.REST_ID, RI.REST_NAME, RI.FOOD_TYPE, RI.FAVORITES, RI.ADDRESS, ROUND(AVG(RR.REVIEW_SCORE), 2) AS SCORE
FROM REST_INFO RI
LEFT JOIN REST_REVIEW RR ON RI.REST_ID = RR.REST_ID
WHERE RI.ADDRESS LIKE "서울%" AND RR.REVIEW_SCORE IS NOT NULL
GROUP BY REST_ID
ORDER BY SCORE DESC, RI.FAVORITES DESC;