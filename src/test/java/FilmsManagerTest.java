import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {

    @Test
    public void shouldAddNoFilm() {
        FilmsManager manager = new FilmsManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddOneFilm() {
        FilmsManager manager = new FilmsManager();

        manager.addMovie("Бладшот");

        String[] expected = {"Бладшот"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddThreeFilms() {
        FilmsManager manager = new FilmsManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Отель.Белград");

        String[] expected = {"Бладшот", "Вперёд", "Отель.Белград"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFilm() {
        FilmsManager manager = new FilmsManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Отель.Белград");

        String[] expected = {"Отель.Белград", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldAddMaxFilms() {
        FilmsManager manager = new FilmsManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Отель.Белград");
        manager.addMovie("Джентльмены");
        manager.addMovie("Человек-невидимка");
        manager.addMovie("Тролли.Мировой тур");
        manager.addMovie("Номер один");

        String[] expected = {"Бладшот", "Вперёд", "Отель.Белград", "Джентльмены", "Человек-невидимка", "Тролли.Мировой тур", "Номер один" };
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

}
