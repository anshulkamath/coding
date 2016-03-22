//
//  main.c
//  CountDown
//
//  Created by Anshul Kamath on 8/11/14.
//  Copyright (c) 2014 ChoppSopht LLC. All rights reserved.
//

#include <readline/readline.h>
#include <stdio.h>
#include <stdlib.h>

int main(int argc, const char * argv[])
{
    printf("Where should I start counting from? ");
    const char *num = readline(NULL);
    int i = atoi(num);
    
    for (i = atoi(num); i >= 0; i -= 3)
    {
        printf("%d\n", i);
        if (i % 5 == 0) {
            printf("Found one!\n");
        }
    }
    return 0;
}

