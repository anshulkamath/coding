//
//  main.c
//  Degrees
//
//  Created by Anshul Kamath on 8/10/14.
//  Copyright (c) 2014 ChoppSopht LLC. All rights reserved.
//

#include <stdio.h>
#include <stdlib.h>
static float lastTemperature;

float fahrenheitFromCelsius(float cel)
{
    float fahr = cel * 1.8 + 32.0;
    printf("%f Celsius is %f Fahrenheit.\n", cel, fahr);
    return fahr;
}

int main(int argc, const char * argv[])
{
    float freezeInC = 0;
    float freezeInF = fahrenheitFromCelsius(freezeInC);
    printf("Water freezes at %f degrees Fahrenheit.\n", freezeInF);
    printf("The last temperature converted to %f.\n", lastTemperature);
    return EXIT_SUCCESS;
}

