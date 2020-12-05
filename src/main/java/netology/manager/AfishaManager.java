package netology.manager;

import netology.domain.Film;

public class AfishaManager {
    private Film[] items = new Film[0];
    private int itemsToShowFilm;

    public AfishaManager(int itemsToShowFilm) {
        this.itemsToShowFilm = itemsToShowFilm;
    }

    public void add(Film item) {
        int length = items.length + 1;
        Film[] tmp = new Film[length];

        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public Film[] getAll() {
        int length = itemsToShowFilm;

        if (itemsToShowFilm < 0) {
            length = 0;
        }

        if (length > items.length) {
            length = items.length;
        }

        Film[] result = new Film[length];

        for (int i = 0; i < length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

}

