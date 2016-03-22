//
//  main.m
//  Stringz
//
//  Created by Anshul Kamath on 4/7/15.
//  Copyright (c) 2015 JAMBAM LLC. All rights reserved.
//

#import <Foundation/Foundation.h>

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        
        NSMutableString *str = [[NSMutableString alloc] init];
        for (int i = 0; i < 10; i++) {
            [str appendString:@"Anshul is cool! The computer says so!\n"];
        }
        // Declare a pointer to an NSError object, but do not instantiate it.
        // The NSError instance will only be created if there is, in fact, an error.
        NSError *error;
        
        // Pass the NSError pointer by reference to the NSString method
        BOOL success = [str writeToFile:@"/tmp/cool.txt"
                             atomically:YES
                               encoding:NSUTF8StringEncoding
                                  error:&error];

        
        // Test the returned BOOL, and query the NSError if the write failed
        if (success) {
            NSLog(@"Done writing /tmp/cool.txt");
        } else {
            NSLog(@"Writing /tmp/cool.txt has failed: %@", [error localizedDescription]);
        }
        
        // Part 2
        NSError *error2;
        NSString *str2 = [[NSString alloc] initWithContentsOfFile:@"/etc/resolv.conf"
                                                         encoding:NSASCIIStringEncoding
                                                            error:&error2];
        if (!str2) {
            NSLog(@"Read failed: %@", [error2 localizedDescription]);
        } else {
            NSLog(@"Done reading /etc/resolv.conf. It looks like this: %@", str2);
        }
        
    }
    return 0;
}
