-- 코드를 입력하세요
SELECT REST_INFO.REST_ID, REST_NAME, FOOD_TYPE, FAVORITES, ADDRESS , ROUND(AVG(REVIEW_SCORE),2) AS SCORE
FROM REST_INFO 
INNER JOIN REST_REVIEW ON REST_REVIEW.REST_ID = REST_INFO.REST_ID
GROUP BY REST_REVIEW.REST_ID
HAVING ADDRESS LIKE "서울%"
ORDER BY ROUND(AVG(REVIEW_SCORE),2) DESC, FAVORITES DESC;

#SELECT round(AVG(REVIEW_SCORE),2) from REST_REVIEW GROUP BY REST_ID;