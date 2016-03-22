//
//  Document.h
//  TahDoodle
//
//  Created by Anshul Kamath on 4/8/15.
//  Copyright (c) 2015 JAMBAM LLC. All rights reserved.
//

#import <Cocoa/Cocoa.h>

@interface Document : NSDocument
    <NSTableViewDataSource>
@property (nonatomic) NSMutableArray *tasks;

@property (nonatomic) IBOutlet NSTableView *taskTable;

- (IBAction)addTask:(id)sender;


@end

