import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BruchTest {
    @Test
    public void TestEquals(){
        assertEquals(new Bruch(1,1), new Bruch(2,2));
        assertEquals(new Bruch(1,4), new Bruch(4,16));
        assertEquals(new Bruch(4,1), new Bruch(8,2));
        assertEquals(new Bruch(3,5), new Bruch(15,25));
        assertEquals(new Bruch(1,1), new Bruch(1,1));
        assertEquals(new Bruch(100,100), new Bruch(100,100));

        assertNotEquals(new Bruch(101,100), new Bruch(100,100));
    }

    @Test
    public void TestAddieren() {
        Bruch bruch1 = new Bruch(1, 2);
        Bruch bruch2 = new Bruch(1, 2);
        Bruch bruch3 = bruch1.addiere(bruch2);



        assertEquals(new Bruch(1, 1), bruch3);
        assertEquals(new Bruch(2, 2), bruch3);
        assertEquals(new Bruch(4, 4), bruch3);



        bruch1 = new Bruch(2, 4);
        bruch2 = new Bruch(1, 4);
        bruch3 = bruch1.addiere(bruch2);


        assertEquals(new Bruch(3, 4), bruch3);
        assertEquals(new Bruch(12, 16), bruch3);



        bruch1 = new Bruch(2, 5);
        bruch2 = new Bruch(1, 4);
        bruch3 = bruch1.addiere(bruch2);


        assertEquals(new Bruch(13, 20), bruch3);



        Bruch b1 = new Bruch(1,3);
        Bruch b2 = new Bruch(1,6);
        assertEquals(new Bruch(1,2), b1.addiere(b2));
    }

}