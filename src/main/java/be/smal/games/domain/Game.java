package be.smal.games.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@Builder(access = AccessLevel.PUBLIC)
@NoArgsConstructor
@AllArgsConstructor
public class Game {

    @Id @GeneratedValue
    private Long id;
    @Column(name = "category_id")
    private int categoryId;

    @Column(name = "difficulty_id")
    private Integer difficultyId;

    @Column(nullable = false)
    private String gameName;

    @Column(nullable = false)
    private String editor;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private int yearEdition;

    @Column(nullable = false)
    private String age;

    @Column(nullable = false)
    private int minPlayers;

    @Column(nullable = false)
    private int maxPlayers;

    private String playDuration;

    @Column(nullable = false)
    private double price;

    private String image;


    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", categoryId=" + categoryId +
                ", difficultyId=" + difficultyId +
                ", gameName='" + gameName + '\'' +
                ", editor='" + editor + '\'' +
                ", author='" + author + '\'' +
                ", yearEdition=" + yearEdition +
                ", age='" + age + '\'' +
                ", minPlayers=" + minPlayers +
                ", maxPlayers=" + maxPlayers +
                ", playDuration='" + playDuration + '\'' +
                ", price=" + price +
                ", image='" + image + '\'' +
                '}';
    }
}
