create table board
(
	num	number	primary key,
	name	varchar2(10),
	title	varchar2(100),
	content	varchar2(1000),
	hits	number	default 0,
	wdate	date	default sysdate,
	attachment	varchar2(50)
);

create sequence board_seq;

insert into board values(board_seq.nextval,'a','d','c',default,default,'aaaa');

select * from BOARD; 