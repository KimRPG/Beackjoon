-- 코드를 입력하세요
SELECT ANIMAL_OUTS.ANIMAL_ID, ANIMAL_OUTS.NAME FROM ANIMAL_OUTS LEFT JOIN ANIMAL_INS on ANIMAL_OUTS.ANIMAL_ID = ANIMAL_INS.ANIMAL_ID where ANIMAL_INS.ANIMAL_ID is null
