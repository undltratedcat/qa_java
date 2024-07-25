package com.example;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTests {

    @Mock
    Feline feline;

    @Test
    public void getKittensIsZero() throws Exception{
        MatcherAssert.assertThat("У Алекса нет котят",
                new LionAlex(feline).getKittens(),
                CoreMatchers.equalTo(0)
        );
    }

    @Test
    public void getPlaceOfLivingIsCorrect() throws Exception {
        MatcherAssert.assertThat("Алекс живёт в Нью-Йоркском зоопарке",
                new LionAlex(feline).getPlaceOfLiving(),
                CoreMatchers.equalTo("Нью-Йоркский зоопарк")
        );
    }

    @Test
    public void getFriendsIsCorrect() throws Exception {
        List<String> expectedList = List.of(
                "Зебра Марти",
                "Бегемотиха Глория",
                "Жираф Мелман"
        );
        MatcherAssert.assertThat("Неправильный список друзей",
                new LionAlex(feline).getFriends(),
                CoreMatchers.equalTo(expectedList)
        );
    }
}