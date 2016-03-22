//
//  main.m
//  Computer Information
//
//  Created by Anshul Kamath on 8/12/14.
//  Copyright (c) 2014 ChoppSopht LLC. All rights reserved.
//

#import <Foundation/Foundation.h>

int main(int argc, const char * argv[])
{

    @autoreleasepool {
        NSHost *comp = [NSHost currentHost];
        NSString *info = [comp localizedName];
        NSLog(@"My Computer's name is %@.\n", info);
        
        
        
    }
    return 0;
}

