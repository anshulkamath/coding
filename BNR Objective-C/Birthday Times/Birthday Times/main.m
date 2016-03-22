//
//  main.m
//  Birthday Times
//
//  Created by Anshul Kamath on 8/13/14.
//  Copyright (c) 2014 ChoppSopht LLC. All rights reserved.
//

#import <Foundation/Foundation.h>

int main(int argc, const char * argv[])
{

    @autoreleasepool {
        NSDate *bday = [[NSDate alloc] init];
        
        //NSDateComponents
        NSDateComponents *comps = [[NSDateComponents alloc] init];
        [comps setYear:2001];
        [comps setMonth:5];
        [comps setDay:24];
        [comps setHour:10];
        [comps setMinute:36];
        [comps setSecond:0];
        
        NSCalendar *g = [[NSCalendar alloc] initWithCalendarIdentifier:NSCalendarIdentifierGregorian];
        NSDate *dateOfBirth = [g dateFromComponents:comps];
        
        double secondsSinceEarlierDate = [bday timeIntervalSinceDate:dateOfBirth];
        NSLog(@"I have been alive for %f seconds.\n", secondsSinceEarlierDate);
        
    }
    return 0;
}

