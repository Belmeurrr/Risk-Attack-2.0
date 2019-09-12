package game_objects.cards;/*
 *   csc413-tankgame-Belmeurrr
 *   Created by Daniel
 *   Created on 8/6/2019 2019 @ 7:38 PM
 */

import java.util.ArrayList;
import java.util.Random;

public class CardDeck {
    ArrayList<Card> cardArrayList;

    public CardDeck() {
        cardArrayList = new ArrayList<>();
        cardArrayList.add(new InfintryCard());
    }

    public void getRandomCard() {
        Random random = new Random();
        cardArrayList.get(random.nextInt(2));
    }
}
