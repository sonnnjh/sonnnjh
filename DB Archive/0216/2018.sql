show database;
use sys;
desc user;

select * from user;
drop table user;
create table user(
no int primary key auto_increment,
id varchar(6) unique key,
pwd varchar(8),
name varchar(10),
age int,
grade varchar(1),
point int
);
insert into user (id,pwd,name,age,grade,point) values ('a','1111','홍길동',15,'A',100);
insert into user values (default, 'b','1111','김길동',25,'B',1000);
insert into user values (default, 'c','1111','김을수',35,'C',99);
insert into user values (default, 'd','1111','삼길동',12,'D',86);
insert into user values (default, 'e','1111','사길동',18,'A',79);
insert into user values (default, 'f','1111','오길동',55,'A',80);
insert into user values (default, 'g','1111','육길동',29,'B',100);
insert into user values (default, 'h','1111','칠길동',31,'C',80);
insert into user values (default, 'i','1111','팔길동',42,'A',60);
insert into user values (default, 'j','1111','구길동',10,'D',30);

select * from user;
delete from user where id='d';
update user set grade='D' where name='김을수';
update user set age='18', point='2000' where name = '홍길동';


update user set pwd = '0000' where name='칠길동';
update user set point=(point+100) ;
update user set point=(point-100) ;


SELECT point, NO
FROM user order by point, no desc LIMIT 3 OFFSET 2 ;

select distinct point
FROM user order by point desc LIMIT 3 OFFSET 2;

UPDATE user SET age=30 where name in ('홍길동', '김길동');

SELECT name,id
FROM user
WHERE point<100;

SELECT *
FROM user
WHERE point between 50 and 100;

SELECT name, age
FROM user
WHERE name like '김%';

 insert into user values (default, 'abcdefghi','1111','이미미',45,'A',700);
 

ALTER TABLE user MODIFY id varchar(9);
desc user;

select * from user;

commit;

create table gradeinfo(
grade varchar(1),
name varchar(4));

insert into gradeinfo values ('A','코끼리반');
insert into gradeinfo values ('B','광어반');
insert into gradeinfo values ('C','우럭반');
insert into gradeinfo values ('D','도다리반');
insert into gradeinfo values ('E','장어반');

SELECT name, point, age
FROM user
WHERE point>=90;
SELECT name, point, age
FROM user
WHERE grade='A' ;
SELECT grade, count(*)
FROM user
WHERE grade = 'C' ;
SELECT avg(point),grade
FROM user
GROUP BY grade HAVING grade in ('A','B','C') ;
SELECT u.name, u.age, g.name
FROM user u inner join gradeinfo g 
on u.grade=g.grade; 

select * from user u right outer join gradeinfo g on u.grade=g.grade;

SELECT *
FROM user u right outer join gradeinfo g on u.grade=g.grade
WHERE u.no is null;
commit;

SELECT u.name, u.id, g.name
FROM user u inner join gradeinfo g
on u.grade=g.grade
WHERE g.name = '도다리반' ; 

SELECT g.name
FROM user u right outer join gradeinfo g on u.grade=g.grade
WHERE u.no is null;
-- ---------------db final--------------------------------
CREATE TABLE EMP
(EMPNO int not null,
ENAME VARCHAR(10),
JOB VARCHAR(9),
MGR int,
HIREDATE datetime,
SAL int,
COMM int,
DEPTNO int);

INSERT INTO EMP VALUES
(7369,'SMITH','CLERK',7902,'1980-12-17',800,null,20);
INSERT INTO EMP VALUES
(7499,'ALLEN','SALESMAN',7698,'1981-02-20',1600,300,30);
INSERT INTO EMP VALUES
(7521,'WARD','SALESMAN',7698,'1981-02-22',1250,200,30);
INSERT INTO EMP VALUES
(7566,'JONES','MANAGER',7839,'1981-04-02',2975,30,20);
INSERT INTO EMP VALUES
(7654,'MARTIN','SALESMAN',7698,'1981-09-28',1250,300,30);
INSERT INTO EMP VALUES
(7698,'BLAKE','MANAGER',7839,'1981-04-01',2850,null,30);
INSERT INTO EMP VALUES
(7782,'CLARK','MANAGER',7839,'1981-06-01',2450,null,10);
INSERT INTO EMP VALUES
(7788,'SCOTT','ANALYST',7566,'1982-10-09',3000,null,20);
INSERT INTO EMP VALUES
(7839,'KING','PRESIDENT',null,'1981-11-17',5000,3500,10);
INSERT INTO EMP VALUES
(7844,'TURNER','SALESMAN',7698,'1981-09-08',1500,0,30);
INSERT INTO EMP VALUES
(7876,'ADAMS','CLERK',7788,'1983-01-12',1100,null,20);
INSERT INTO EMP VALUES
(7900,'JAMES','CLERK',7698,'1981-10-03',950,null,30);
INSERT INTO EMP VALUES
(7902,'FORD','ANALYST',7566,'1981-10-3',3000,null,20);
INSERT INTO EMP VALUES
(7934,'MILLER','CLERK',7782,'1982-01-23',1300,null,10);

CREATE TABLE DEPT
(DEPTNO int,
DNAME VARCHAR(14),
LOC VARCHAR(13) );

INSERT INTO DEPT VALUES (10,'ACCOUNTING','NEW YORK');
INSERT INTO DEPT VALUES (20,'RESEARCH','DALLAS');
INSERT INTO DEPT VALUES (30,'SALES','CHICAGO');
INSERT INTO DEPT VALUES (40,'OPERATIONS','BOSTON');

CREATE TABLE SALGRADE
( GRADE int,
LOSAL int,
HISAL int );

INSERT INTO SALGRADE VALUES (1,700,1200);
INSERT INTO SALGRADE VALUES (2,1201,1400);
INSERT INTO SALGRADE VALUES (3,1401,2000);
INSERT INTO SALGRADE VALUES (4,2001,3000);
INSERT INTO SALGRADE VALUES (5,3001,9999);

select * from SALGRADE;
-- Step1 --------------------------------------------------
-- 1. 사원테이블에서 직위별 최소 월급을 구하되 직위가 CLERK인 것만 출력하라.
SELECT job, min(sal)
FROM emp 
GROUP BY job ;
select *
from emp
where job='CLERK';
-- 답
SELECT job, min(sal)
FROM emp
WHERE job='CLERK'
GROUP BY job
;
-- 2. 커미션이 책정된 사원은 모두 몇 명인가?
select count(*)
from emp
where comm is not null;

-- 3. 직위가 'SALESMAN'이고 월급이 1000이상인 사원의 이름과 월급을 출력하라.
select *
from emp 
where job='salesman';
select *
from emp
where sal>=1000;
select ename, sal
from emp
where job='salesman' and sal>=1000;

-- 4. 부서별 평균월급을 출력하되, 평균월급이 2000보다 큰 부서의 부서번호와 평균월급을 출력하라.

select deptno, (select sal from emp group by sal having avg (sal))
from emp 
group by sal, deptno having avg(sal);

select deptno, avg(sal)
from emp 
group by deptno having avg(sal);
select deptno, avg(sal)
from emp
group by deptno  having avg(sal)>2000;
-- 5. 직위가 MANAGER인 사원을 뽑는데 월급이 높은 사람 순으로 이름, 직위, 월급을 출력하라.
select ename, job, sal
from emp
where job='manager'
order by sal desc;
-- 6. 각 직위별로 총월급을 출력하되 월급이 낮은 순으로 출력하라.
select job, sum(sal)
from emp
group by job having sum(sal) 
order by sum(sal) desc;
-- 7. 직위별 총월급을 출력하되, 직위가 'MANAGER'인 사원들은 제외하라. 그 총월급이 5000보다 큰 직위와 총월급만 출력하라.
-- (1)직위별 총 월급
select job, sum(sal)
from emp
group by job having sum(sal);
-- (2)직위가 manager일 사원 제외
select job
from emp
where job != 'manager';
-- (3)총 월급이 5000보다 큰
select ename, sum(sal)
from emp
where sum(sal)>5000;

select job, sum(sal)
from emp
where job != 'manager'
group by job having sum(sal)>5000;
-- 8. 직위별 최대월급을 출력하되, 직위가 'CLERK'인 사원들은 제외하라. 
-- 그리고 그 최대월급이 2000 이상인 직위와 최대월급을 최대 월급이 높은 순으로 정렬하여 출력하라.

-- (1)직위별 최대월급 
 select job, max(sal)
from emp
group by job having max(sal);
--  (2)직위가 'CLERK'인 사원들은 제외
select job
from emp
where job != 'CLERK';
select job, max(sal)
from emp 
where job != 'CLERK'
group by job having max(sal)>=2000
order by max(sal) desc ;

-- Step 2
-- 9. 사원들의 이름, 부서번호, 부서이름을 출력하라.
select * 
from emp e
join dept d
on e.deptno = d.deptno;

select e.ename, e.deptno, d.dname
from emp e
join dept d
on e.deptno = d.deptno;
-- 10.
select e.ename, e.deptno, e.job, d.dname
from emp e join dept d
on e.deptno = d.deptno 
where d.loc='DALLAS';

-- 11.
 select e.ename, d.dname
from emp e join dept d 
on e.deptno = d.deptno;

select * 
from emp
where ename like ('%A%');
select e.ename, d.dname
from emp e right outer join dept d 
on e.deptno = d.deptno
where ename like ('%A%');

-- 12.
select e.ename, d.dname, e.sal
from emp e join dept d 
on e.deptno = d.deptno
where e.sal >= 3000;

-- 13.
select *
from emp e join dept d 
on e.deptno = d.deptno;

select d.dname, e.ename, e.job
from emp e join dept d on e.deptno = d.deptno
where e.job = 'salesman';
-- 14.커미션이 책정된 사원들의 사원번호, 이름, 연봉, 연봉+커미션, 급여등급을 출력하되, 각각의 컬럼명을 '사원번호', '사원이름', '연봉','실급여', '급여등급'으로 하여 출력하라.
select e.empno 사원번호, ename 사원이름, e.sal 월급, sal+comm 실급여, s.grade 급여등급
from emp e
join salgrade s
on e.sal between s.losal and hisal;

select e.empno 사원번호, e.ename 사원이름, e.sal 월급, e.sal+e.comm 실급여, s.grade 급여등급
from emp e join salgrade s 
on sal
where e.sal+e.comm
between losal and hisal ;


-- 15. 부서번호가 10번인 사원들의 부서번호, 부서이름, 사원이름,월급, 급여등급을 출력하라.
select * 
from emp e join dept d on e.deptno = d.deptno
join salgrade s on sal
where d.deptno = 10;


select e.deptno, d.dname, e.ename, e.sal, s.grade
from emp e join dept d on e.deptno = d.deptno
join salgrade s on sal
where d.deptno = 10;


-- 16. 부서번호가 10번, 20번인 사원들의 부서번호, 부서이름, 사원이름, 월급, 급여등급을 출력하라. 그리고 그 출력된 결과물을 부서번호가 낮은 순으로, 월급이 높은 순으로 정렬하라.
select e.deptno, d.dname, e.ename, e.sal, s.grade
from emp e join dept d on e.deptno = d.deptno
join salgrade s on sal
where d.deptno in (10, 20)
order by e.sal desc, d.deptno asc;


-- 17. 사원번호와 사원이름, 그리고 그 사원을 관리하는 관리자의 사원번호와 사원이름을 출력하되 각각의 컬럼명을 '사원번호', '사원이름', '관리자번호', '관리자이름'으로 하여 출력하라.

select e.empno 사원번호, e.ename 사원이름, d.deptno 관리자번호, d.dname 관리자이름
from emp e join dept d 
on e.deptno = d.deptno;

-- Step3 
-- 1. 평균 급여보다 높은 사람의 급여를 받는 사람의 이름과 급여
select avg(sal)
from emp;

select sal, ename
from emp
group by sal, ename having sal > avg(sal);

select sal, ename
from emp
where sal> (select avg(sal) from emp);


-- 2. 각 직무별 급여가 1000이상인 직무와 인원수
select count(sal)
from emp 
where sal >= 1000 ;

select job, (select count(sal) from emp where sal >= 1000)
from emp ;

select job, count(*)
from emp
where sal >= 1000
group by job ;


-- 3. deptno가 20인 사람중에 평균(20그룹평균)급여보다 많이 받는 사람의 이름과, 급여와 부서번호

select sal, ename, deptno
from emp
where sal> (select avg(sal) from emp where deptno=20);

select avg(sal) from emp where deptno=20;

select sal, ename, deptno
from emp
where deptno=20 and
sal> (select avg(sal) from emp where deptno=20);

-- 4. deptno가 20인 사람중에 평균(전체평균)급여보다 많이 받는 사람의 이름과, 급여와 부서번호

select sal, ename, deptno
from emp
where  deptno = 20 and 
sal> (select avg(sal) from emp);

-- 5. deptno가 20인 사람중에 평균(전체평균)급여보다 많이 받는 사람의 이름과, 급여와 부서번호와 부서명
select e.sal, e.ename, e.deptno, d.dname
from emp e join dept d 
on e.deptno = d.deptno
where  e.deptno = 20 and
          e.sal> (select avg(sal) from emp);
          
-- 6. smith보다 높은 급여를 받는 사람의 이름과 급여

select sal
from emp
where ename='smith';

select ename, sal
from emp
where sal>(select sal
from emp
where ename='smith');


-- 7. 모든 직원의 이름과 직무, 입사년도(hiredata)를 출력하시오. 입사년도는 년월일만 출력한다.

select ename, job, hiredate (yyyy-mm-dd)
from emp;

select ename, job, date_format(hiredate, '%y-%m-%d')
from emp;


-- 8. 각 직원이 받는 급여의 grade를 서브쿼리로 해결하세요.   직원명, 급여, 급여등급

select *, ( case when 700 <= sal and sal <= 1200 then 1
                    when 1201 <= sal and sal  <= 1400 then 2
                    when 1401 <= sal and sal <= 2000 then 3
                    when 2001 <= sal and sal <= 3000 then 4
                    when 3001 <= sal and sal <= 9999 then 5
            end) grade
from emp;

select c.sal, c.ename, c.grade
from (select *, case when 700 <= sal and sal <= 1200 then 1
					  when 1201 <= sal and sal  <= 1400 then 2
					  when 1401 <= sal and sal <= 2000 then 3
					  when 2001 <= sal and sal <= 3000 then 4
					  when 3001 <= sal and sal <= 9999 then 5
				 end grade from emp) c
group by c.grade ;


-- 9. 각 직원이 받는 급여와 동일한 grade의 최저급여와 최고급여도 같이 출력하시오. 직원명, 급여, 등급, 최저급여, 최고급여 (서브쿼리로 해결하시오)
select ename, sal, ( case when 700 <= sal and sal <= 1200 then 1
                    when 1201 <= sal and sal  <= 1400 then 2
                    when 1401 <= sal and sal <= 2000 then 3
                    when 2001 <= sal and sal <= 3000 then 4
                    when 3001 <= sal and sal <= 9999 then 5
            end) grade
from emp
group by ename, sal having min(sal) and max(sal);

select ename, sal, ( case when 700 <= sal and sal <= 1200 then 1
                    when 1201 <= sal and sal  <= 1400 then 2
                    when 1401 <= sal and sal <= 2000 then 3
                    when 2001 <= sal and sal <= 3000 then 4
                    when 3001 <= sal and sal <= 9999 then 5
            end) grade
from emp
group by ename, sal, grade having min(sal) and max(sal);


-- 10. 직원을 모두 출력하시오.. 직원명 직무 상급자명(MGR의 ename) 기본급


select e1.ename, e1.job, e2.ename, e2.sal
from emp e1 inner join emp e2
on e1.empno = e2.mgr;

select e1.ename 직원, e1.job, e2.ename 상급자, e2.sal
from emp e1 left outer join emp e2
on e1.mgr = e2.empno;



-- 11. 10번문제를 서브쿼리로 해결하시오.






-- 11. 커미션이 없는 직원을 모두 출력하시오 (서브쿼리)

select * 
from emp
where comm is null;

commit;
-- 12. deptno별 인원수를 출력하시오. 단 인원수가 4명 이상인 부서만 출력하시오.  인원수 deptno
-- 13. deptno별 인원수를 출력하시오. 단 인원수가 4명 이상인 부서만 출력하시오.  인원수 deptno dname
-- 14. 관리자가 없는 직원의 이름과 직위를 구하시오
-- 15. 관리자가 없는 직원의 이름과 직위, 근무지를 구하시오
-- 16. FORD와 같은 부서에서 근무하는 사람의 이름과 직위 근무지를 출력하시오.
-- 17. martin이 관리하고 있는 직원의 이름과 직위와 기본급을 출력하시오.
-- 18. 부서별 최저 급여를 받는 사람의 이름과 급여를 출력하시오.
-- 19. 다음 쿼리문을 추가하고 .. 부서별 부서번호, 이름, 직원의 수를 출력하시오.






