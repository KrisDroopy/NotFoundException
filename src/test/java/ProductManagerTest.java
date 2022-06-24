import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.manager.ProductManager;

public class ProductManagerTest {

    ProductManager manager = new ProductManager();

    Product one = new Book(1, "Благие знамения", 400, "Терри Пратчетт");
    Product two = new Smartphone(2, "A25", 30000, "Samsung");
    Product three = new Smartphone(3, "M35", 50000, "Samsung");
    Product four = new Book(4, "Никогде", 500, "Нил Гейман");

    @Test
    public void shouldSaveAndFindAll() {
        manager.save(one);
        manager.save(two);
        manager.save(three);
        manager.save(four);

        Product[] actual = manager.findAll();
        Product[] expected = {one, two, three, four};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldSearchByNotFound() {
        manager.save(one);
        manager.save(two);
        manager.save(three);
        manager.save(four);

        Product[] actual = manager.searchBy("10");
        Product[] expected = {};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldSearchBy() {
        manager.save(one);
        manager.save(two);
        manager.save(three);
        manager.save(four);

        Product[] actual = manager.searchBy("5");
        Product[] expected = {two, three};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldRemoveById() {
        manager.save(one);
        manager.save(two);
        manager.save(three);
        manager.save(four);


        Product[] actual = manager.removeById(3);
        Product[] expected = {one, two, four};

        assertArrayEquals(actual, expected);
    }
}
