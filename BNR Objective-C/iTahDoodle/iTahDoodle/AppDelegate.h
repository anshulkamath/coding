//
//  AppDelegate.h
//  iTahDoodle
//
//  Created by Anshul Kamath on 4/8/15.
//  Copyright (c) 2015 JAMBAM LLC. All rights reserved.
//

#import <UIKit/UIKit.h>

// Declare a helper function that you will use ot get a path
// to the location on disk where you can save the to-do list
NSString *BNRDocPath(void);

@interface AppDelegate : UIResponder
    <UIApplicationDelegate, UITableViewDataSource>

@property (strong, nonatomic) UIWindow *window;

@property (nonatomic) UITableView *taskTable;
@property (nonatomic) UITextField *taskField;
@property (nonatomic) UIButton *insertButton;

@property (nonatomic) NSMutableArray *tasks;

- (void)addTask: (id)sender;


@end

