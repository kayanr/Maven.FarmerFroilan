package Days;

import com.zipcodewilmington.froilansfarm.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.AssertJUnit;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class Tuesday {


    @Test
    public void MorningRoutine() {

    }

    @Test
    public void NotHarvestedTest() {
    Person person = new Person("Froilan");
    Tractor tractor = new Tractor(false, true, false);

    CropRow<CornStalk> cornRow = new CropRow<>();
    CropRow<TomatoPlant> tomatoRow = new CropRow<>();
    CornStalk corn = new CornStalk();
    TomatoPlant tomato = new TomatoPlant();
    cornRow.plant(corn);
    tomatoRow.plant(tomato);

    cornRow.stream().map(Crop::hasBeenHarvested).forEach(AssertJUnit::assertFalse);
    tomatoRow.stream().map(Crop::hasBeenHarvested).forEach(AssertJUnit::assertFalse);
    }

    @Test
    public void HarvestedTest() {
        Person person = new Person("Froilan");
        Tractor tractor = new Tractor(false, true, false);

        CropRow<CornStalk> cornRow = new CropRow<>();
        CropRow<TomatoPlant> tomatoRow = new CropRow<>();
        CornStalk corn = new CornStalk();
        TomatoPlant tomato = new TomatoPlant();
        cornRow.plant(corn);
        tomatoRow.plant(tomato);

        if (tractor.canHarvest()) {
            for (CornStalk crop : cornRow) {
                crop.harvest();
            }
        }

        if (tractor.canHarvest()) {
            for (TomatoPlant crop : tomatoRow) {
                crop.harvest();
            }
        }

        cornRow.stream().map(Crop::hasBeenHarvested).forEach(AssertJUnit::assertTrue);
        tomatoRow.stream().map(Crop::hasBeenHarvested).forEach(AssertJUnit::assertTrue);
    }
}
