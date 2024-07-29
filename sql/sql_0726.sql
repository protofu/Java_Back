# 테이블 데이터 조회
SELECT * FROM emp;

# 테이블 열 이름으로 조회
SELECT job FROM emp;
SELECT ename, job FROM emp;
SELECT name, area, popu From tcity;

-- tcity 테이블에서 데이터 조회 (region, name, area 컬럼만 조회)
SELECT region, name, area From tcity;

# 별명(Alias) 열이름 AS 별명
# 열이름 별명(AS를 생략하고 한 칸 띄워 작성 가능)
# 열이름 `별명` (별명에 띄어쓰긴나 한글, 예약어 등이 있을 때는 백틱으로 감싸는 것을 권장)
SELECT region as 도시명, name, area From tcity;
SELECT region 도시명, name `인구 (만명)`, area From tcity;
SELECT region as 도시명, name, `area` 면적 From tcity;

SELECT name AS `도시명`, popu AS `인구` FROM tcity WHERE metro='n';

# 산술 표현식
SELECT name `도시명`, popu * 10000 AS `인구` FROM tcity;
SELECT * FROM tcity WHERE popu = 300 + 42;
SELECT 1+2+3+4+5 AS `5까지의 합계`;

-- tcity 테이블에서 데이터(name, area popu, 인구밀도) 조회
-- 인구밀도는 인구수를 면적으로 나눈 값
SELECT name, area, popu, popu/area AS `인구밀도` FROM tcity;

-- SELECT문을 통해서 1년은 몇 초인가 계산하기
SELECT 60 * 60 * 24 * 365 AS `1년은 00초다!`;

# 컬럼 연결(Concatenate) - concat(arg1, arg2, arg3, ...)
SELECT concat("최인규", "는", "ㅋㅋ") AS `명언`;
SELECT concat(name, " ", grade) `직원` FROM tstaff;

# DISTINCT 중복 제거
SELECT DISTINCT region FROM tcity;

# 정렬 (ORDER BY)
SELECT * FROM tcity ORDER BY region;
SELECT * FROM tcity ORDER BY area;
SELECT * FROM tcity ORDER BY popu DESC, region;

SELECT * FROM tcity ORDER BY popu;
SELECT * FROM tcity ORDER BY popu DESC;
SELECT * FROM tcity ORDER BY region, name DESC;
SELECT * FROM tcity ORDER BY 5, 1 DESC;
SELECT name AS `도시명`, popu AS `인구` FROM tcity ORDER BY `인구` DESC;

-- tstaff 테이블에서 salary가 적은 사람부터 순서대로 출력하되,
-- salary가 같다면 score가 높은 사람을 먼저 조회
SELECT * FROM tstaff ORDER BY salary, score DESC;

-- tcity 테이블에서 metro가 n인 데이터를 조회(name, popu 컬럼만 조회 - 인구수 내림차순)
SELECT name, popu FROM tcity WHERE metro = 'n' ORDER BY popu DESC;

-- tstaff 테이블에서 joindate가 2015년 이전인 데이터 조회(name, depart, grade 컬럼만 조회)
SELECT * FROM tstaff;
SELECT count(*) FROM tstaff WHERE joindate < '2016-01-01';

# NULL은 비교할 때, IS 또는 IS NOT을 사용한다.
SELECT * FROM tstaff WHERE score IS NULL;

# 논리 연산자
SELECT * FROM logic_operation;
SELECT `a`, `b`, `and` FROM logic_operation WHERE a=1 AND b=1;
SELECT `a`, `b`, `or` FROM logic_operation WHERE a=1 OR b=1;
SELECT `a` FROM logic_operation WHERE NOT a=1;

-- OR과 NOT을 이용해 AND 연산
SELECT `a`, `b`, `and` FROM logic_operation WHERE NOT (NOT a=1 OR NOT b=1);

-- AND과 NOT을 이용해 OR 연산
SELECT `a`, `b`, `or` FROM logic_operation WHERE NOT (NOT a=1 AND NOT b=1);

-- tstaff 테이블에서 salart가 300 미만이면서 score는 60 이상인 직원이 누구인지 조회
SELECT * FROM tstaff WHERE salary < 300 AND score >= 60;
-- tstaff 테이블에서 인사과 남자 직원과 영업부 여자 직원을 모두 조회
SELECT * FROM tstaff WHERE depart = '인사과' AND gender = '남' OR depart = '영업부' AND gender = '여';

-- emp 테이블에서 이름이 'T'라는 글자가 들어가는 직원을 검색
SELECT * FROM emp WHERE ename LIKE '%T%';
-- emp 테이블에서 이름이 'T'라는 글자가 들어가지 않는 직원을 검색
SELECT * FROM emp WHERE ename NOT LIKE '%T%';
-- emp 테이블에서 이름이 'T'로 끝나는 직원을 검색
SELECT * FROM emp WHERE ename LIKE '%T';
-- emp 테이블에서 이름이 'T'로 시작하는 직원을 검색
SELECT * FROM emp WHERE ename LIKE 'T%';
-- promotion_tbl 테이블에서 promotion_msg에 30%라는 글자가 들어가는 상품 검색
SELECT * FROM promotion_tbl WHERE promotion_msg LIKE '%30\%%';

# BETWEEN ~ AND ~
SELECT * FROM tcity WHERE popu BETWEEN 50 AND 100;
SELECT * FROM tcity WHERE popu >= 50 AND popu <= 100;

SELECT * FROM tstaff WHERE name BETWEEN '가' AND '사';
SELECT * FROM tstaff WHERE joindate BETWEEN '20150101' AND '20180101';

# IN
SELECT * FROM tcity WHERE region IN ('경상', '전라');
SELECT * FROM tcity WHERE region = '경상' OR region = '전라';

-- tcity 테이블에서 area가 500~1000 사이의 도시 목록을 조회
SELECT * FROM tcity WHERE area BETWEEN 500 AND 1000;
-- tcity 테이블에서 region 필드가 경상 또는 전라가 아닌 모든 도시를 조회
SELECT * FROM tcity WHERE NOT (region = '경상' OR region = '전라');
SELECT * FROM tcity WHERE region NOT IN ('경상', '전라');
-- tstaff 테이블에서 성이 '이'씨 이거나 '안'씨인 직원을 조회
SELECT * FROM tstaff WHERE name LIKE '이%' OR name LIKE '안%';
-- tstaff 테이블에서 총무부나 영업부에 근무하는 직원을 조회
SELECT * FROM tstaff WHERE depart LIKE '총무부' OR depart LIKE '영업부';
SELECT * FROM tstaff WHERE depart IN ('총무부', '영업부');
-- tstaff 테이블에서 인사과나 영업부에 근무하는 대리를 조회
SELECT * FROM tstaff WHERE grade LIKE '대리' AND (depart LIKE '인사과' OR depart LIKE '영업부');
SELECT * FROM tstaff WHERE grade LIKE '대리' AND depart IN ('인사과', '영업부');

# 행의 개수 제한 - LIMIT [건너뛸 개수,] 조회할 개수
SELECT * FROM tcity ORDER BY area DESC LIMIT 4;
SELECT * FROM tcity ORDER BY area DESC LIMIT 0, 4;
SELECT * FROM tcity ORDER BY area DESC LIMIT 4, 4;

-- tstaff 테이블에서 salary가 높은 상위 5명의 직원을 조회
SELECT * FROM tstaff ORDER BY salary DESC LIMIT 5;
-- tstaff 테이블에서 area가 넓은 도시 중 앞의 2개는 건너뛰고 이후 3개의 도시를 조회
SELECT * FROM tcity ORDER BY area DESC LIMIT 2, 3;
-- tstaff 테이블에서 salary 순으로 내림차순 정렬한 후 12~ 16위까지 조회
SELECT * FROM tstaff ORDER BY salary DESC LIMIT 11, 5;
# 테이블 중복 제거하여 조회
SELECT DISTINCT job FROM emp;

# 테이블 구조와 속성 파악
DESC tcity;
DESC emp;

# WHERE 구에서 연산하기
SELECT * FROM tcity WHERE popu * 10000 / area < 1000;
SELECT *, (popu * 10000 / area < 1000) `인구밀도` FROM tcity WHERE (popu * 10000 / area) < 1000;

# ORDER BY 구에서 연산하기
SELECT * FROM tcity ORDER BY (popu * 10000 / area) DESC;
SELECT *, (popu * 10000 / area) `인구밀도` FROM tcity ORDER BY `인구밀도` DESC;

# NULL과 하는 모든 연산은 NULL이다.
SELECT NULL * 1, NULL - 1, NULL + 1, NULL / 1, 1 / NULL;

# 산수 함수
SELECT 10 % 3 AS `연산자 연산`, MOD(10, 3) AS `함수 연산`, 10 + 3 AS `연산자 연산2`, ROUND(10.5), ROUND(12123.141592, -4);

-- tstaff 테이블에서 score가 짝수면 0, 홀수면 1을 표시하는 `홀짝` 열 출력
SELECT *, TRUNCATE(score, 0)%2 `짝홀` FROM tstaff;
SELECT *, FLOOR(score)%2 `짝홀` FROM tstaff;

-- emp 테이블에서 EMPNO가 홀수인 데이터의 모든 컬럼을 조회
SELECT * FROM emp WHERE empno%2;
SELECT * FROM emp WHERE MOD(empno, 2) = 1;

-- tstaff 테이블에서 score를 소수점 첫째자리에서 반올림하여 데이터를 조회
SELECT *, ROUND(score, 0) FROM tstaff;

# 문자 관련 함수
SELECT productname, CONCAT(price, '원') `개당 가격`, CONCAT(amount, '개') `재고 수량`, CONCAT(price * amount, '원') `총 가격` FROM buytbl; 

-- usertbl 테이블에서 name과 name의 길이를 조회
SELECT name, CONCAT(TRUNCATE(LENGTH(name)/3, 0), '글자') FROM usertbl;
-- emp 테이블의 hiredate 컬럼을 통해 4자리 연도, 2자리 달을 출력
SELECT LEFT(hiredate, 4), SUBSTRING(hiredate, 6, 2) FROM emp;

# 날짜
SELECT CURRENT_TIME() + INTERVAL 3600 SECOND;
SELECT CURRENT_TIME() + INTERVAL 60 MINUTE;
SELECT CURRENT_TIME() + INTERVAL 1 HOUR;
SELECT ADDDATE(CURRENT_TIME(), INTERVAL 1 HOUR);
SELECT SUBDATE(CURTIME(), INTERVAL 1 HOUR);

SELECT CURRENT_DATE();
SELECT CURRENT_DATE() + INTERVAL 365 DAY;
SELECT CURRENT_DATE() + INTERVAL 12 MONTH;
SELECT CURRENT_DATE() + INTERVAL 1 YEAR;

SELECT CURRENT_DATE();
SELECT CURRENT_TIMESTAMP();

-- tstaff 테이블에서 오늘 날짜까지 입사 후 며칠이 지났는지 조회
SELECT *, CONCAT(DATEDIFF(CURRENT_DATE(), joindate), '일 경과') FROM tstaff;
SELECT CONCAT(DATEDIFF(CURRENT_DATE(), '1996-05-12'), '일 경과');
-- usertbl 테이블에서 birthyear와 mdate 컬럼을 사용해, 만 나이 조회
SELECT name, (YEAR(CURDATE())-birthyear - (RIGHT(CURDATE(), 5)<RIGHT(mdate, 5))) `만 나이` FROM usertbl;

-- tstaff 테이블에서
-- salary가 300 이상이면 salary의 30%
-- 그렇지 않으면 salary의 50%로 계산한 성과급 컬럼을 추가하여 데이터 조회alter
SELECT *, 
	CASE 
		WHEN salary >= 300 THEN salary*0.3 
        ELSE salary*0.5 
	END `성과급` 
FROM tstaff;
-- tstaff 테이블에서
-- grade가 사원이면 100, 대리이면 200, 나머지는 300으로 성과급 컬럼을 추가하여
-- 데이터 조회
SELECT *, 
	CASE 
		WHEN grade LIKE '사원' THEN 100 
		WHEN grade LIKE '대리' THEN 200 
        ELSE 300 
	END `성과급` 
FROM tstaff;

-- tcity -> 경상의 인구 총합
SELECT popu FROM tcity WHERE region = '경상';
SELECT CONCAT(SUM(popu), '만 명') FROM tcity WHERE region = '전라';

-- tstaff -> 영업부 몇명?
SELECT COUNT(*) FROM tstaff WHERE depart = '영업부';

-- emp -> 연봉 3000 ~ 4000 이름 연봉
SELECT ename, sal FROM emp WHERE sal BETWEEN 3000 AND 4000;

-- buytbl -> 운동화 구매 아이디, 구매수량
SELECT userid, amount FROM buytbl WHERE productname = '운동화';

-- tcar -> 가격 3000 이상 / 자동차 이름, 제조사
SELECT * FROM tcar;
SELECT car, maker FROM tcar WHERE price >= 3000;

-- usertbl -> 1990년생 이름과 생년
SELECT * FROM usertbl;
SELECT name, birthyear FROM usertbl WHERE birthyear LIKE '199_';

-- tstaff -> 평균 연봉
SELECT * FROM tstaff;
SELECT SUM(salary)/COUNT(*) FROM tstaff WHERE gender = '남';
SELECT AVG(salary) FROM tstaff WHERE gender = '남';

-- tstaff -> 과장 / 이름 부서
SELECT * FROM tstaff;
SELECT name, depart FROM tstaff WHERE grade='과장';

-- tcar -> 현대 자동차 목록
SELECT * FROM tcar WHERE maker='현대';

-- promotion_tbl -> Product C 의 프로모션 메세지
SELECT * FROM promotion_tbl;
SELECT 
    promotion_msg
FROM
    promotion_tbl
WHERE
    product_name = 'Product C';
    
    
