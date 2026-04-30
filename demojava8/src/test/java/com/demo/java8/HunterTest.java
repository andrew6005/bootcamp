package com.demo.java8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.junit.jupiter.MockitoExtension;
@ExtendWith(MockitoExtension.class)
public class HunterTest {

   
    @Test
    void testCreateHunter() {
        Hunter h1 = new Hunter(this.gun);
        Assertions.assertEquals(true, h1.isAlive());
        
    }
    @Test
    void addbullet(){
      Mockito.when(this.gun.addBullet()).thenReturn(true);
      new Hunter h1 new Hunter(this.gun);
      Assertions.assertEquals(false, h1.addbullet());

       Mockito.when(this.gun.addBullet()).thenReturn(true);
      new Hunter h2 new Hunter(this.gun);
      Assertions.assertEquals(false, h2.addbullet());
      Gun g1 = new Gun();
      

    }
    @Test
    void shoot(){
    Hunter h1 = new Hunter(this.gun);
    Hunter h2 = new Hunter(this.gun2);

        Assertions.assertEquals(false, h2.isAlive());
        Assertions.assertEquals(true, h1.isAlive());

  h1.Shoot(h2);
  System.out.println(h1.isAlive());
  System.out.println(h2.isAlive());
  Mockito.doThrow(new RuntimeException()).when(this.gun).shoot();
  Hunter h3 =  new  Hunter(this.gun);
  Hunter h4 = new Hunter(this.gun2);
  Assertions.assertEquals(RuntimeException.class,()-> h3.shoot(h4));
  Assertions.assertTrue(h4.isAlive());



    }
    @Test
    void testshoot(){
         Gun g1 = new Gun();
         Assertions.assertThrows(RuntimeException.class, ()-> g1.shoot());




    }


}

