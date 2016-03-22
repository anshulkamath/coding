//
//  main.c
//  gradeInTheShade
//
//  Created by Anshul Kamath on 4/9/15.
//  Copyright (c) 2015 JAMBAM LLC. All rights reserved.
//

#include <stdio.h>
#include <stdlib.h> // malloc(), free()

float averageFloats(float data[], int dataCount)
{
    float sum = 0.0;
    for (int i = 0; i < dataCount; i++) {
        sum = sum + data[i];
    }
    return sum / dataCount;
}

int main(int argc, const char * argv[]) {
    
    // Create an array of floats
    float gradeBook[] = {60.2, 94.5, 81.1};
    
    // Calculate the average
    float average = averageFloats(gradeBook, 3);
    
    // No cleanup needed. Array is automatically freed
    
    printf("Average: %.2f\n", average);
    
    
    return 0;
}
