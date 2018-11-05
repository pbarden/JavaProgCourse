/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */ 
package bicycledemo;

/**
 *
 * @author paulb
 */
class BicycleDemo {
    public static void main(String[] args) {

        // Create two different 
        // Bicycle objects
        MountainBike bike1 = new MountainBike();
        MountainBike bike2 = new MountainBike();
        RoadBike bike3 = new RoadBike();
        RoadBike bike4 = new RoadBike();

        // Invoke methods on 
        // those objects
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();
        
        bike2.changeCadence(40);
        bike2.speedUp(20);
        bike2.changeGear(3);
        bike2.changeCadence(35);
        bike2.speedUp(15);
        bike2.changeGear(2);
        bike2.printStates();

        bike3.changeCadence(50);
        bike3.speedUp(10);
        bike3.changeGear(2);
        bike3.changeCadence(40);
        bike3.speedUp(10);
        bike3.changeGear(3);
        bike3.printStates();

        bike4.changeCadence(40);
        bike4.speedUp(15);
        bike4.changeGear(3);
        bike4.printStates();

        System.out.println("There are " + bike4.getBicycleCount() + " bicycles.");
    }
}

