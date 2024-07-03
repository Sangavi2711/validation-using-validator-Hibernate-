package com.model;
import javax.persistence.Entity;
import javax.validation.constraints*;
@Entity
@Table(name="NewEmpData")
public class Users {
@Id
@GeneratedValue(strategy=GenerationType.Auto)
@Notnull(message="Invalid ID.please enter you ID")
private long userId;
@size(max=20,min=3,message="Invalid name.Size should be between 3 and 20")
@NotEmpty(message="please enter your name")
private String username;
@Email(message="Invalid email address.please enter a proper email id")
@NotEmpty(message="please enter your email id")
private String userEmailID;
@Digits(integer=3,fraction=0,message="Invalid age.Maximum valid number is 3 digits")
private int age;
@max(value=5,message="Invalid number of article.Maximum allowed is 5")
private String currentTimeOfWritingArticles;
@min(value=3,message="Invalid number of article for review.Minimum 3 needed")
private String allowedForArticleReviewing;
@NotBlank(message="proficiency level 3 should not be blank ")
private String proficiency3;
@Null(message="proficiency level 4 should be null")
private String proficiency4;
@pattern(regexp="YN",flags= {
		pattern.Flag.CASE_INSENSITIVE}, message="Invalid proficiency level 5"
)
}
