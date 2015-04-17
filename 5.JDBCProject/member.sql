/*사용자 계정 생성*/

create user jspuserd ideentified by jsp1234;

--SQL
--정의언어(DDL) : create, alter, drop
--조작언어(DML) : insert, update, delete, select
--제어언어(DCL) : grant, rvoke

create table member(
	id 		varchar2(15) 	primary key,
	pwd 	varchar2(10),
	name	varchar2(20),
	age		number,
	gender	char(1),
	addr 	varchar2(100),
	regdate date 			default sysdate
);


select * from MEMBER

insert into MEMBER
values ('test','1234','홍길동',20,1,'서울시','2014-04-14');
insert into MEMBER
values ('test1','1234','홍길동',20,1,'서울시',default);

drop table member

update MEMBER
set addr = '경기도'
where id='test1'

delete member
where id='test'