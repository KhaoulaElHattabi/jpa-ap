## Activité pratique N°2 : JPA Hibernate, Spring Data

JPA-AP est une application Spring Boot pour explorer l'acces aux données.
- On a commencé l'activité par la création d'un projet spring en ajoutant les dependance : Lombok, Spring Data, Spring Web et H2 database (comme base de données initiale)
- La declaration d'une entité JPA "Patients" qui presente une table dans la base de données en utilisation des annotations du Lombok.
<p align="center">
   <img src="https://user-images.githubusercontent.com/92638641/234074225-aff4af53-4e43-4283-ba4c-61994665b331.png">
</p>

- La configuration de l'application dans le fichier application.properties pour specifier la creation de la base de données en untilisant H2 Database.

<p align="center">
<img src=""/>
</p>

 - Implementation de l'interface Patient Repository qui herite de la classe Jpa Repository et qui est basée sue Spring Data pour la creation des differentes methodes en utilisant les annotations JPA pour permettre le mapping des objets relationnels (ORM) et laisser le code independant de Hibernate.

<p align="center">
<img src="https://user-images.githubusercontent.com/92638641/234076967-aec68f29-fdea-4f3f-a6d4-72d949521b61.png"/>
</p>

-la classe JpaApplication est la classe principale de spring boot application avec l'annotation @SpringBootApplication  qui contient les annotations suivantes:  @Configuration @EnableAutoConfiguration @ComponentScan. Aussi cette classe va contient instance de l'interface PatientRepository avec l'annotation @Autowired (chercher le bean specifié)
- Ensuite 
