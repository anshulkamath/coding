//
//  main.c
//  Affirmation
//
//  Created by Anshul Kamath on 4/9/15.
//  Copyright (c) 2015 JAMBAM LLC. All rights reserved.
//

#include <stdio.h>
#include <stdlib.h>

int main(int argc, const char * argv[]) {
    
    if (argc != 3)
    {
        fprintf(stderr, "Usage: Affirmation <adjective> <number>\n");
        return 1;
    }
    
    int count = atoi(argv[2]);
    
    for (int j = 0; j < count; j++) {
        printf("You are %s!\n", argv[1]);
    }
    
    return 0;
}
