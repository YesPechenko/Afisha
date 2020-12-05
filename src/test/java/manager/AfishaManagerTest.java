package manager;

import netology.domain.Film;
import netology.manager.AfishaManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {
    private AfishaManager manager = new AfishaManager(10);
    Film first = new Film(1, "name1", "horror");
    Film second = new Film(2, "name2", "drama");
    Film third = new Film(3, "name3", "comedy");
    Film fourth = new Film(4, "name4", "cartoon");
    Film fifth = new Film(5, "name5", "action");
    Film sixth = new Film(6, "name6", "cartoon");
    Film seventh = new Film(7, "name7", "horror");
    Film eighth = new Film(8, "name8", "drama");
    Film ninth = new Film(9, "name9", "comedy");
    Film tenth = new Film(10, "name10", "cartoon");
    Film eleventh = new Film(11, "name11", "action");
    Film twelfth = new Film(12, "name12", "cartoon");
    Film thirteen = new Film(13, "name13", "drama");

    @Test
    void shouldAdd() {
        manager.add(first);
        manager.add(second);
        manager.add(third);

        Film[] actual = manager.getAll();
        Film[] expected = new Film[]{third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldAfishaEmpty() {
        Film[] actual = manager.getAll();
        Film[] expected = new Film[]{};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldAddMaxFilm() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelfth);
        manager.add(thirteen);

        Film[] actual = manager.getAll();
        Film[] expected = new Film[]{thirteen, twelfth, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowLessMax() {
        AfishaManager manager = new AfishaManager(5);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);

        Film[] actual = manager.getAll();
        Film[] expected = new Film[]{seventh, sixth, fifth, fourth, third};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowMoreMax10() {
        AfishaManager manager = new AfishaManager(13);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelfth);
        manager.add(thirteen);

        Film[] actual = manager.getAll();
        Film[] expected = new Film[]{thirteen, twelfth, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldNotFilm () {
        AfishaManager manager = new AfishaManager(0);

        manager.add(first);
        manager.add(second);
        manager.add(third);

        Film[] actual = manager.getAll();
        Film[] expected = new Film[]{};

        assertArrayEquals(expected, actual);

    }
}




