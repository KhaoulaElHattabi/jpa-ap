## Activité pratique N°2 : JPA Hibernate, Spring Data


JPA-AP est une application Spring Boot pour explorer l'acces aux données.
- On a commencé l'activité par la création d'un projet spring en ajoutant les dependance : Lombok, Spring Data, Spring Web et H2 database (comme base de données initiale)
- La declaration d'une entité JPA "Patients" qui presente une table dans la base de données en utilisation des annotations du Lombok.
<p align="center">
   <img src="https://user-images.githubusercontent.com/92638641/234074225-aff4af53-4e43-4283-ba4c-61994665b331.png">
</p>

- La configuration de l'application dans le fichier application.properties pour specifier la creation de la base de données en untilisant H2 Database.

<p align="center">
<img src="https://user-images.githubusercontent.com/92638641/234079813-6b9903cd-72f9-4fb5-a2f7-47b60d3835e7.png"/>
</p>
- Par la suite l'entité est traduite à une table dans la base de données et les attributs dans les elements du table.
<p align="center">
<img src="https://user-images.githubusercontent.com/92638641/234082721-47228378-ae72-47fd-86f3-71b5966e0b63.png"/>
</p>

 - Implementation de l'interface Patient Repository qui herite de la classe Jpa Repository et qui est basée sue Spring Data pour la creation des differentes methodes en utilisant les annotations JPA pour permettre le mapping des objets relationnels (ORM) et laisser le code independant de Hibernate.

<p align="center">
<img src="https://user-images.githubusercontent.com/92638641/234076967-aec68f29-fdea-4f3f-a6d4-72d949521b61.png"/>
</p>

-  la classe JpaApplication est la classe principale de spring boot application avec l'annotation @SpringBootApplication  qui contient les annotations suivantes:  @Configuration @EnableAutoConfiguration @ComponentScan. Aussi cette classe va contient instance de l'interface PatientRepository avec l'annotation @Autowired (chercher le bean specifié)
<p align="center">
<img src="https://user-images.githubusercontent.com/92638641/234084230-eff1e6ed-913e-482f-88c5-1feb7e142934.png"/>
</p>
- Ensuite on a testé quelques operations sur les données par les methodes deja implementées dans m'interface PatientRepository en utilisant aussi des methodes prédefinis par Spring Framework dans la classe JpaRepository comme: <br>
   <br>
-  Ajout des patients :<br>
   <p align="center">
<img src="https://user-images.githubusercontent.com/92638641/234084480-89b94d30-8f2d-47f7-b4f6-c04c0eb97837.png"/>
</p>
      <br>
-  La pagination et afficher nombre des pages, des elements et des spring data donne les methodes de base (save, delete, get = pour print) qui se trouve dans JpaApplication :<br>
   <p align="center">
<img src="https://user-images.githubusercontent.com/92638641/234086001-f3a17a7f-6613-4f21-a048-8507c5b21f8f.png"/>
</p>
