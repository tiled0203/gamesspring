package be.smal.games.domain;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Builder(access = AccessLevel.PUBLIC)
@NoArgsConstructor
@AllArgsConstructor
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "category_id")
    private Integer categoryId;

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
