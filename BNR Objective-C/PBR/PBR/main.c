//
//  main.c
//  PBR
//
//  Created by Anshul Kamath on 8/11/14.
//  Copyright (c) 2014 ChoppSopht LLC. All rights reserved.
//

#include <stdio.h>
#include <math.h>
    void metersToFeetAndInches(double meters, unsigned int *ftPtr, double *inPtr)
    {
        //This function assumes that Meters is non-negative
        
        //Convert the number of meters into a floating-point number of feet
        double rawFeet = meters * 3.281;
        
        //How many complete feet in an unsigned int?
        unsigned int feet = (unsigned int)floor(rawFeet);
        
        //Store the number of feet at the supplied address
        if (ftPtr)
        {
        printf("Storing %u to the address %p\n", feet, ftPtr);
        *ftPtr = feet;
        }
        //Calculate inches
        double fractionalFoot = rawFeet - feet;
        double inches = fractionalFoot * 12.0;
        
        //Store the numbers of inches at the supplied address
        if (inPtr)
        {
        printf("Storing %.2f to the address %p\n", inches, inPtr);
        *inPtr = inches;
        }
    }
int main(int argc, const char * argv[])
{
    double meters = 3.0;
    unsigned int feet;
    double inches;
    
    metersToFeetAndInches(meters, &feet, &inches);
    printf("%.1f meters is equal to %d feet and %.1f inches.\n", meters, feet, inches);
    
    return 0;
}

