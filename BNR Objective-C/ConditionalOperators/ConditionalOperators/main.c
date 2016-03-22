//
//  main.c
//  ConditionalOperators
//
//  Created by Anshul Kamath on 8/10/14.
//  Copyright (c) 2014 ChoppSopht LLC. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[])
{
    int i = 20;
    int j = 25;
    int k = ( i > j ) ? 10 : 5;
    
    if ( 5 < j - k)
    {
        printf("The first expression is true.");
    }
    else if ( j>i )
    {
        printf("The second condition is true.");
    }
    else
    {
        printf("Neither expression is true.");
    }
}

