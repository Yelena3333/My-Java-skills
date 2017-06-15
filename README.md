# My-tech-skills
This repositiry reflects some of my technical skills

My SQL queries demonstration (data base from http://www.sql-ex.ru):

Select i.* , o.out from income_o as i left join outcome_o as o on i.point=o.point and i.date=o.date
Union
Select o.point, o.date , i.inc, o.out from outcome_o as o left join income_o as i on i.point=o.point and i.date=o.date


Select outq.*, incq.inc from
(Select point, date, sum(out) as out from outcome group by date, point) as outq
Left join
(Select point, date, sum(inc) as inc from income group by date, point) as incq on outq.point=incq.point and outq.date=incq.date
Union
Select incq.point, incq.date, outq.out, incq.inc from
(Select point, date, sum(out) as out from outcome group by date, point) as outq 
right join
(Select point, date, sum(inc) as inc from income group by date, point) as incq on outq.point=incq.point and outq.date=incq.date


Select distinct p.type, l.model, l.speed from laptop as l join product as p on l.model=p.model 
where l.speed < all (select speed from pc)


Select maker, count(model) from product where type='PC' group by maker
Having count(model)>=3


Select distinct p.maker, pr.price from product as p join printer as pr on p.model=pr.model and pr.price=(select min(price) from printer where color='y') and pr.color='y'


Select avg(lap.price) from
(Select p.model, price from pc join product as p on p.model=pc.model and p.maker='A'
Union all
Select p.model, price from laptop as l join product as p on p.model=l.model and p.maker='A') as lap


With ste as(
Select distinct model, price from pc
Union
Select distinct model, price from laptop
Union
Select distinct model, price from printer)
Select model from ste where price in (
Select max(price) from ste)

