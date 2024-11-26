package Days;

import com.zipcodewilmington.froilansfarm.Crop;
import com.zipcodewilmington.froilansfarm.CropDuster;
import com.zipcodewilmington.froilansfarm.CropRow;
import com.zipcodewilmington.froilansfarm.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Monday {

    @Test
    public void MorningRoutine(){

    }


    @Test
    public void FertilizingTest(){
        Person person = new Person("Froilanda");
        //CropDuster cropDuster = new CropDuster();

        Crop cropRow1 = new Crop();
        Crop cropRow2 = new Crop();
        Crop cropRow3 = new Crop();

        assertFalse(cropRow1.hasBeenFertilized());
        assertFalse(cropRow2.hasBeenFertilized());
        assertFalse(cropRow3.hasBeenFertilized());



        assertTrue(cropRow1.hasBeenFertilized());
        assertTrue(cropRow2.hasBeenFertilized());
        assertTrue(cropRow3.hasBeenFertilized());

    }
}
