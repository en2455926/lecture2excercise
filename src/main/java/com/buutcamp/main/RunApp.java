package com.buutcamp.main;

import com.buutcamp.inputhandle.HandleInput;

import java.io.BufferedReader;

public class RunApp {

    public RunApp() {
        HandleInput handleInput = new HandleInput();

        while (true)  {
            /**
             * Program main loop begins here
             */
            String userInput =
                    handleInput.getUserInput();
            System.out.println(userInput);

            if (userInput.equals("exit")) {

                break;

            }
            /**
             * Program main loop endes here
             * an jumps back to the begining
             * of the while loop
             */

            // else if () {
            // rakenteita tänne }

            // else if () {
            // rakenteita tänne }
            }

        }

}

