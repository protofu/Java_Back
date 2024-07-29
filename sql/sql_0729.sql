# database 선택
use study_db;

SELECT IF(10>20, "참", "거짓");

SELECT
	CASE 10
		WHEN 1 THEN "일"
        WHEN 5 THEN "오"
        WHEN 10 THEN "십"
		ELSE "모름"
        END `CASE 연산`;
        
SELECT
	*,
    CASE grade
		WHEN '사원' THEN 100
        WHEN '대리' THEN 200
        ELSE 300
	END `성과급`
    FROM tstaff;
    
# CASE문은 조건에 따른 값을 지정한다.
# CASE문은 검색 CASE문과 단순 CASE문으로 구분할 수 있다.


-- tstaff 테이블에서 score가 null인 경우, 0으로 바꾸어 출력
SELECT *,
	CASE
		WHEN score IS NULL THEN 0
        ELSE score
        END
	FROM tstaff;
    
-- tstaff 테이블에서 gender가
-- '남'인 경우, 1으로
-- '여'인 경우, 2로 바꾸어 `성별` 컬럼을 추가해서 출력

SELECT *,
	CASE gender
		WHEN '남' THEN 1
        WHEN '여' THEN 2
	END `성별`
FROM tstaff;

# CASE문은 SELECT구 뿐만 아니라 WHERE, ORDER BY 구에서도 적용 가능

SELECT *
FROM tstaff
WHERE
	CASE grade
		WHEN '사원' THEN 1
        WHEN '대리' THEN 2
        WHEN '차장' THEN 3
        WHEN '과장' THEN 4
        WHEN '부장' THEN 5
        WHEN '이사' THEN 6
	END BETWEEN 3 AND 6;
    
-- grade별로 각각 번호를 지정하여 정렬

SELECT *
FROM tstaff
ORDER BY
	CASE grade
		WHEN '사원' THEN 1
        WHEN '대리' THEN 2
        WHEN '차장' THEN 3
        WHEN '과장' THEN 4
        WHEN '부장' THEN 5
        WHEN '이사' THEN 6
	END DESC, salary;
    
# GROUP BY - 그룹화
SELECT 
	grade, 
	AVG(salary) `직급별 평균 임금`,
	SUM(salary) `직급별 임금 합계`,
    COUNT(*) `직급별 직원수`
FROM tstaff
GROUP BY grade;

# 그룹화할 때는 2개 이상의 컬럼 지정도 가능하다.
SELECT 
    depart, gender, CONCAT(COUNT(*), '명') `부서 성별에 따른 직원 수`
FROM
    tstaff
GROUP BY depart , gender
ORDER BY depart , gender;

-- 문자열 데이터의 합계 구하기 > 0으로 나온다.
-- MAX, MIN 값은 사전식 정렬을 통한 최대, 최소값을 반환한다.
SELECT SUM(grade), AVG(grade), MAX(grade), MIN(grade)
FROM tstaff
GROUP BY depart;

SELECT addr, SUM(mdate) 
FROM usertbl
GROUP BY addr;

-- tstaff 테이블이 가진 데이터 개수(총 직원 수) 조회
SELECT COUNT(*) FROM tstaff;
-- tstaff 테이블에서 급여가 400 이상인 직원 수 조회
SELECT COUNT(*) FROM tstaff WHERE salary >= 400;
-- tstaff 테이블에서 직급별 직원수 조회
SELECT grade, COUNT(*) FROM tstaff GROUP BY grade;
-- tstaff 테이블에서 직급 종류 개수 조회
SELECT COUNT(DISTINCT grade) FROM tstaff;
-- tstaff 테이블에서 socre 값이 없는 직원 수 조회
SELECT COUNT(*) FROM tstaff WHERE score IS NULL;
-- tstaff 테이블에서 인사과의 평균 급여 조회
SELECT depart, AVG(salary) FROM tstaff WHERE depart = '인사과';
-- tcity 테이블에서 인구의 총합과 평균을 조회
SELECT SUM(popu), AVG(popu) FROM tcity;
-- tcity 테이블에서 면적의 최소값과 최대값을 조회
SELECT MIN(area), MAX(area) FROM tcity;

-- emp 테이블에서 총 인원수, 최대 급여, 최소 급여, 급여의 평균
SELECT 
	COUNT(*) `총 인원`, 
    MAX(sal) `최대 급여`, 
    MIN(sal) `최소 급여`, 
    AVG(sal)`급여의 평균` 
FROM emp;
-- emp 테이블에서 업무(job)별 인원수, 최대 급여, 최소급여, 급여의 평균
DESC emp;
SELECT 
	JOB,
	COUNT(*) `총 인원`, 
    MAX(sal) `최대 급여`, 
    MIN(sal) `최소 급여`, 
    AVG(sal)`급여의 평균` 
FROM emp
GROUP BY job;
-- emp 테이블에서 최대 급여와 최소 급여의 차이
SELECT MAX(sal) - MIN(sal) `최대 - 최소` FROM emp; 

# HAVING - 그룹화 조건 (GROUP BY와 함께 쓰여, 출력할 그룹의 조건을 지정)
SELECT
	depart, AVG(salary)
FROM tstaff
GROUP BY depart
HAVING AVG(salary) >= 350;

# 2개 이상의 테이블로부터 데이터를 추출
DESC dept;
SELECT deptno  FROM dept
UNION ALL
SELECT deptno FROM emp ORDER BY deptno;

# 서브커리
SELECT 
    *
FROM
    dept
WHERE
    deptno IN (SELECT 
            deptno
        FROM
            emp
        WHERE
            ename IN ('SMITH' , 'ALLEN'));

SELECT name
FROM tcity
WHERE popu = ( SELECT MAX(popu) FROM tcity);

-- emp 테이블을 이용해 평균 급여보다 더 많은 급여를 받는 사원을 검색
desc emp;
SELECT ename FROM emp WHERE sal > (SELECT AVG(sal) FROM emp);
-- emp 테이블에서 MILLER와 같은 부서(deptno)에서 근무하는 사원을 검색
SELECT ename 
FROM emp 
WHERE deptno = (SELECT deptno FROM emp WHERE ename = 'MILLER');
-- emp 테이블에서 MILLER와 동일한 job을 가진 사원을 검색
SELECT ename 
FROM emp 
WHERE job = (SELECT job FROM emp WHERE ename = 'MILLER');
-- emp 테이블에서 MILLER의 급여(sal)와 동일하거나 더 많이 받는 사원을 검색
SELECT ename 
FROM emp 
WHERE sal >= (SELECT sal FROM emp WHERE ename = 'MILLER');
-- emp 테이블에서 deptno을 이용해 LOC가 DALLAS인 사원 검색(DEPT 테이블 활용)
SELECT ename 
FROM emp 
WHERE deptno = (SELECT deptno FROM dept WHERE LOC = 'DALLAS');
-- emp 테이블에서 직속상관(MGR) 이름이 KING인 사원 찾기
SELECT * FROM emp;
SELECT ename 
FROM emp 
WHERE MGR = (SELECT empno FROM emp WHERE ename = 'KING');
    
desc tstaff;
SELECT *
FROM tstaff
WHERE (depart, gender) = (
	SELECT depart, gender FROM tstaff WHERE name="안중근"
);

# 다중 행 서브 쿼리 (서브쿼리의 결과가 여러 줄 -> 다중 행 연산자를 사용)
# IN (서브쿼리 결과 중 하나라도 일치하면 true)
-- emp 테이블에서 부서별로 가장 급여를 많이 받는 사원들과 동일한 급여를 받는 사원 조회
SELECT * FROM emp WHERE sal IN (
	SELECT MAX(sal) FROM emp GROUP BY deptno
);

# ALL(서브쿼리 결과 중 모두 일치하면 true)
SELECT sal FROM emp WHERE deptno = 30;
SELECT * FROM emp WHERE sal > ALL(
	SELECT sal FROM emp WHERE deptno = 30
);

# ANY, SOME
SELECT * FROM emp WHERE sal > ANY(
	SELECT sal FROM emp WHERE deptno=30
);

# EXIST - (데이터 존재 여부 확인)
# 테이블 안에 sal이 2000 넘는 직원이 1명이라도 있다면 테이블 전체 조회
SELECT * FROM emp WHERE exists(
	SELECT 1 FROM emp WHERE sal > 2000
);

desc emp;
-- emp 테이블에서 부서별로 가장 급여를 많이 받는 사원들과 동일한 급여를 받는 사원 검색
SELECT * FROM emp WHERE sal IN (
	SELECT MAX(sal) FROM emp GROUP BY deptno
);
-- emp 테이블에서 sal을 3000 이상 받는 사원이 소속된 부서와 동일한 부서에서 근무하는 사원 검색
SELECT * FROM emp WHERE deptno IN (
	SELECT deptno FROM emp WHERE sal >= 3000
);
-- emp 테이블에서 job이 manager인 사람이 속한 부서 정보 검색
SELECT * FROM emp WHERE deptno IN (
	SELECT deptno FROM emp WHERE job = 'MANAGER'
);
-- emp 테이블에서 BLAKE와 동일한 부서에 있는 모든 사원 검색
SELECT * FROM emp WHERE deptno IN (
	SELECT deptno FROM emp WHERE ename = 'BLAKE'
);
-- emp 테이블에서 평균 급여(sal) 이상을 받는 모든 사원 검색. 급여가 많은 순
SELECT * FROM emp WHERE sal >= (
	SELECT AVG(sal) FROM emp
)
ORDER BY sal DESC;
SELECT * FROM emp;
-- emp 테이블에서 이름에 'T' 가 있는 사원이 근무하는 부서에 있는 모든 사원 검색. 사원 번호순
SELECT * FROM emp WHERE deptno IN (
	SELECT deptno FROM emp WHERE ename LIKE '%T%'
)
ORDER BY empno DESC;
-- emp 테이블에서 근무지역이 DALLAS인 사원 정보 검색
desc dept;
SELECT * FROM emp WHERE deptno = (
	SELECT deptno FROM dept WHERE LOC = 'DALLAS'
)

# JOIN (2개 이상의 테이블을 엮어서 데이터를 조회)
# CROSS JOIN (모든 집합 JOIN _ A 테이블 행의 개수 * B 테이블 행의 개수) 카티션 곱
SELECT * FROM tcar, tmaker;
SELECT COUNT(*) FROM tcar CROSS JOIN tmaker;

SELECT car, capacity FROM tcar CROSS JOIN tmaker;
SELECT tcar.maker, tmaker.maker FROM tcar CROSS JOIN tmaker;
-- JOIN에서 테이블 별명을 붙인 후에는 WHERE 절에서 별명을 사용하는 것이 필수!
SELECT c.maker, m.maker FROM tcar AS c CROSS JOIN tmaker AS m;
SELECT c.* FROM tcar AS c CROSS JOIN tmaker AS m;

SELECT * FROM tcar, tmaker WHERE tcar.maker = tmaker.maker;

# INNER JOIN
SELECT * FROM tcar, tmaker WHERE tcar.maker = tmaker.maker;
SELECT * FROM tcar INNER JOIN tmaker ON tcar.maker = tmaker.maker;

# NATURAL JOIN (문법)
SELECT * FROM tcar NATURAL JOIN tmaker;
SELECT * FROM tcar JOIN tmaker USING (maker);

# SELF JOIN (구조)
SELECT CONCAT(e.ename, '의 매니저 ', m.ename) 
FROM emp e JOIN emp m ON e.mgr = m.empno;
SELECT CONCAT(e.ename, '의 매니저 ', m.ename) 
FROM emp e, emp m WHERE e.mgr = m.empno;

-- dept 테이블의 LOC가 'NEW YORK' 인 사원의 이름과 급여를 조회
SELECT * FROM emp WHERE deptno = (
	SELECT DISTINCT deptno FROM dept WHERE LOC = 'NEW YORK'
);
SELECT emp.ename, emp.sal 
FROM emp 
JOIN dept ON emp.deptno = dept.deptno 
WHERE LOC = 'NEW YORK';

-- dept 테이블의 dname 컬럼의 값이 'ACCOUNTING' 인 사원의 이름과 입사일
desc dept;
SELECT emp.ename, emp.hiredate
FROM emp JOIN dept ON emp.deptno = dept.deptno
WHERE dept.dname = 'ACCOUNTING';

-- emp 테이블의 job이 'MANAGER' 인 사원의 이름, 부서명
desc emp;
SELECT ename, dname FROM emp JOIN dept
WHERE job = 'MANAGER';

-- emp 테이블과 salgrade 테이블을 이용
-- 각 급여에 해당하는 등급 매핑, 이름, 급여, 등급 조회
SELECT * FROM salgrade;
SELECT ename, sal, grade 
FROM emp JOIN salgrade ON losal<sal and hisal>sal
ORDER BY grade;

-- emp 테이블에서 MANAGER가 'KING'인 사원들의 이름, 직급을 조회
SELECT e.ename, e.job 
FROM emp e JOIN emp m ON e.mgr = m.empno
WHERE m.ename = 'KING';

# INNER JOIN (내부 조인, equi join & non-equi join)
# 두 테이블을 조인할 때, 두 테이블에 모두 지정한 열의 데이터가 있어야 한다.
# 가장 많이 사용. (조인 = 내부 조인)

# OUTER-JOIN (외부 조인)
# 두 테이블을 조인할 때, 한 쪽 테이블에만 데이터가 있어도 결과가 나온다.
# LEFT OUTER JOIN : 왼쪽 테이블 모든 값 출력
# RIGHT OUTER JOIN : 오른쪽 테이블 모든 값 출력
# FULL OUTER JOIN : 왼쪽 또는 오른쪽 테이블의 모든 값이 출력(MySQL 미지원)
# FULL 은  LEFT UNION ALL RIGHT
SELECT CONCAT(e.ename, "의 매니저 ", m.ename)
FROM emp e
LEFT JOIN emp m ON e.mgr = m.empno;

# FULL OUTER JOIN -> MySQL 버전
SELECT * FROM tcar
LEFT JOIN tmaker ON tcar.maker = tmaker.maker
UNION
SELECT * FROM tcar
RIGHT JOIN tmaker ON tcar.maker = tmaker.maker;


# CROSS JOIN (상호 조인)
# 한쪽 테이블에 다른쪽 테이블을 교차곱(카티션 곱)

# SELF JOIN (자체 조인)
# 자기 자신 조인, 1개의 테이블 사용
# 별도의 문법이 있는 것이 아니라 테이블 한 개로 조인한 것

# 다중 조인(테이블을 계속 중첩)
SELECT c.car, ct.metro
FROM tcar c
JOIN tmaker m ON c.maker = m.maker
JOIN tcity ct ON m.factory = ct.name
WHERE c.car = '소나타';

-- 사원(emp) 테이블과 부서(dept) 테이블을 조인하여 사원명, 부서번호, 부서명
-- 사원 테이블에는 부서번호 40번 데이터 없지만, 40번 부서의 부서명도 출력
-- desc dept;
SELECT * FROM emp;
SELECT e.ename, e.deptno, d.dname
FROM emp e
RIGHT JOIN dept d ON e.deptno = d.deptno;

-- NEW YORK에서 근무하는 사원에 대하여 사원명, 업무, 급여, 부서명
SELECT e.ename, e.job, e.sal, d.dname
FROM emp e
JOIN dept d USING (deptno)
WHERE d.LOC = 'NEW YORK';

-- 보너스(comm)가 null이 아닌 사원에 대하여 사원명, 부서명, 위치
SELECT * FROM emp;
SELECT e.ename, d.dname, d.loc
FROM emp e
JOIN dept d USING (deptno)
WHERE e.comm IS NOT NULL;

-- 사원 중 L 자가 있는 사원명, 업무, 부서명, 위치
SELECT e.ename, e.job, d.dname, d.loc
FROM emp e
JOIN dept d USING (deptno)
WHERE e.ename LIKE '%L%';

-- 관리자보다 먼저 입사한 사원 이름, 입사일, 관리자이름, 관리자 입사일
SELECT e.ename `사원`, e.hiredate `고용일`, m.ename `매니저`, m.hiredate `고용일`
FROM emp e
JOIN emp m ON e.mgr = m.empno
WHERE e.hiredate<m.hiredate;

INSERT INTO tcity
Values ('강릉', 1040, 21, 'N', '강원');

INSERT INTO tcity (name, area, popu, metro, region)
Values ('원주', 867, 35, 'y', '강원');

DELETE FROM tcity;
INSERT INTO tCity (name, area, popu, metro, region) VALUES
('서울',605,974,'y','경기'), 
('부산',765,342,'y','경상'),
('오산',42,21,'n','경기'),
('전주',205,65,'n','전라'),
('순천',910,27,'n','전라'),
('춘천',1116,27,'n','강원'),
('홍천',1819,7,'n','강원');

INSERT INTO tcity VALUES 
('이천',461,21,'n','경기'),
('대구',883,248,'y','경상'),
('영월',1127,4,'n','강원'); 

INSERT INTO tcity(
SELECT factory, 940, 83, 'n', '충청' 
FROM tmaker WHERE maker = '쌍용');

SELECT * FROM tcity;
DELETE FROM tcity WHERE name = '부산';
DELETE FROM tcity WHERE region = '경기';
DELETE FROM tcity WHERE popu > 50;

SELECT * FROM tmaker;

-- 영업부 전원 삭제

DELETE FROM tstaff WHERE depart = '영업부';
SELECT * FROM tstaff;

# UPDATE 테이블
-- tcity name이 서울 // popu 1000 region 충청
UPDATE tcity SET popu = 1000, region = '충청' WHERE name = '서울'; 
-- tcity name 오산 // popu 2배
UPDATE tcity SET popu = 2*popu WHERE name = '오산'; 
-- emp 여자 사원 // 차장
UPDATE tstaff SET grade = '차장' WHERE gender = '여';
-- 총무부 직원의 월급 10% 인상
UPDATE tstaff SET salary = salary*1.1 WHERE depart = '총무부';
SELECT * FROM tstaff;