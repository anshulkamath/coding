//
//  main.c
//  Triangle
//
//  Created by Anshul Kamath on 8/10/14.
//  Copyright (c) 2014 ChoppSopht LLC. All rights reserved.
//

#include <stdio.h>

float remainingAngle(angleA, angleB)
{
    float angleLeft = 180.0 - angleA - angleB;
    
    return angleLeft;
}

int main(int argc, const char * argv[])
{
    float angleA = 30.0;
    float angleB = 60.0;
    float angleC = remainingAngle(angleA, angleB);
    printf("The third angle is %.2f\n", angleC);
}

