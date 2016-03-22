//
//  main.m
//  TimesTwo
//
//  Created by Anshul Kamath on 8/16/14.
//  Copyright (c) 2014 ChoppSopht LLC. All rights reserved.
//

#import <Foundation/Foundation.h>

int main(int argc, const char * argv[])
{

    @autoreleasepool {
        
        NSDate *currentTime = [NSDate date];
        NSLog(@"currentTime's value is %p.", currentTime);
        
        NSDate *startTime = currentTime;
        
        sleep(2);
        
        currentTime = [NSDate date];
        NSLog(@"currentTime's value is now %p", currentTime);
        NSLog(@"The address of the original object is %p", startTime);
        
        currentTime = nil;
        NSLog(@"currentTime's value is %p and the value of startTime is %p", currentTime, startTime);
    }
    return 0;
}

