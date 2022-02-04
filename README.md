# Software Process Models: 
A software process model is a simplified representation of a software process.

## Waterfall Model
In The Waterfall approach, the whole process of software development is divided into separate phases.  The next phase is started only after the defined set of goals are achieved for previous phase and it is signed off and phases do not overlap.

The sequential phases in Waterfall model are −

- Requirement Gathering and analysis − All possible requirements of the system to be developed are captured in this phase and documented in a requirement specification document.

- System Design − The requirement specifications from first phase are studied in this phase and the system design is prepared. This system design helps in specifying hardware and system requirements and helps in defining the overall system architecture.

- Implementation − With inputs from the system design, the system is first developed in small programs called units, which are integrated in the next phase. Each unit is developed and tested for its functionality, which is referred to as Unit Testing.

- Integration and Testing − All the units developed in the implementation phase are integrated into a system after testing of each unit. Post integration the entire system is tested for any faults and failures.

- Deployment of system − Once the functional and non-functional testing is done; the product is deployed in the customer environment or released into the market.

- Maintenance − There are some issues which come up in the client environment. To fix those issues, patches are released. Also to enhance the product some better versions are released. Maintenance is done to deliver these changes in the customer environment.

<img src="sdlc_waterfall_model.jpg" width="500" >

**Application**<br>

**Advantages**<br>
Some of the major advantages of the Waterfall Model are as follows −

- Simple and easy to understand and use

- Easy to manage due to the rigidity of the model. Each phase has specific deliverables and a review process.

- Phases are processed and completed one at a time.

- Works well for smaller projects where requirements are very well understood.

- Clearly defined stages.

- Well understood milestones.

- Easy to arrange tasks.

- Process and results are well documented.

**Disadvantages**<br>
Some of the major advantages of the Waterfall Model are as follows −

- No working software is produced until late during the life cycle.

- High amounts of risk and uncertainty.

- Not a good model for complex and object-oriented projects.

- Poor model for long and ongoing projects.

- Not suitable for the projects where requirements are at a moderate to high risk of changing. So, risk and uncertainty is high with this process model.

- It is difficult to measure progress within stages.

- Cannot accommodate changing requirements.

- Adjusting scope during the life cycle can end a project.

- Integration is done as a "big-bang. at the very end, which doesn't allow identifying any technological or business bottleneck or challenges early.

## Iterative Model

Iterative process starts with a simple implementation of a subset of the software requirements and iteratively enhances the evolving versions until the full system is implemented. At each iteration, design modifications are made and new functional capabilities are added.

<img src="sdlc_iterative_model.jpg" width="500" >


**Application**

**Advantages**<br>
Some of the advantages of the Iterative and Incremental SDLC Model are as follows −

- Some working functionality can be developed quickly and early in the life cycle.

- Results are obtained early and periodically.

- Parallel development can be planned.

- Progress can be measured.

- Less costly to change the scope/requirements.

- Testing and debugging during smaller iteration is easy.

- Risks are identified and resolved during iteration; and each iteration is an easily managed milestone.

- Easier to manage risk - High risk part is done first.

- With every increment, operational product is delivered.

- Issues, challenges and risks identified from each increment can be utilized/applied to the next increment.

- Risk analysis is better.

- It supports changing requirements.

- Initial Operating time is less.

- Better suited for large and mission-critical projects.

- During the life cycle, software is produced early which facilitates customer evaluation and feedback.

**Disadvantages**<br>
Some of the disadvantages of the Iterative and Incremental SDLC Model are as follows −

- More resources may be required.

- Although cost of change is lesser, but it is not very suitable for changing requirements.

- More management attention is required.

- System architecture or design issues may arise because not all requirements are gathered in the beginning of the entire life cycle.

- Defining increments may require definition of the complete system.

- Not suitable for smaller projects.

- Management complexity is more.

- End of project may not be known which is a risk.

- Highly skilled resources are required for risk analysis.

- Projects progress is highly dependent upon the risk analysis phase.

## V-Model
Under the V-Model, the corresponding testing phase of the development phase is planned in parallel. So, there are Verification phases on one side of the ‘V’ and Validation phases on the other side. The Coding Phase joins the two sides of the V-Model.

<img src="sdlc_v_model.jpg" width="500" >


**Verification Phases**

**Business Requirement Analysis**<br>
This is the first phase in the development cycle where the product requirements are understood from the customer’s perspective. This phase involves detailed communication with the customer to understand his expectations and exact requirement. The acceptance test design planning is done at this stage as business requirements can be used as an input for acceptance testing.

**System Design**<br>
Once you have the clear and detailed product requirements, it is time to design the complete system. The system design will have the understanding and detailing the complete hardware and communication setup for the product under development. The system test plan is developed based on the system design. Doing this at an earlier stage leaves more time for the actual test execution later.

**Architectural Design**<br>
Architectural specifications are understood and designed in this phase. Usually more than one technical approach is proposed and based on the technical and financial feasibility the final decision is taken. The system design is broken down further into modules taking up different functionality. This is also referred to as High Level Design.

**Module Design**<br>
In this phase, the detailed internal design for all the system modules is specified, referred to as Low Level Design (LLD). It is important that the design is compatible with the other modules in the system architecture and the other external systems. The unit tests are an essential part of any development process and helps eliminate the maximum faults and errors at a very early stage. These unit tests can be designed at this stage based on the internal module designs.

**Coding Phase**

The actual coding of the system modules designed in the design phase is taken up in the Coding phase. The best suitable programming language is decided based on the system and architectural requirements. The coding is performed based on the coding guidelines and standards. The code goes through numerous code reviews and is optimized for best performance before the final build is checked into the repository.

**Validation Phases**

The different Validation Phases in a V-Model are explained in detail below.

**Unit Testing**<br>
Unit tests designed in the module design phase are executed on the code during this validation phase. Unit testing is the testing at code level and helps eliminate bugs at an early stage, though all defects cannot be uncovered by unit testing.

**Integration Testing**<br>
Integration testing is associated with the architectural design phase. Integration tests are performed to test the coexistence and communication of the internal modules within the system.

**System Testing**<br>
System testing is directly associated with the system design phase. System tests check the entire system functionality and the communication of the system under development with external systems. Most of the software and hardware compatibility issues can be uncovered during this system test execution.

**Acceptance Testing**<br>
Acceptance testing is associated with the business requirement analysis phase and involves testing the product in user environment. Acceptance tests uncover the compatibility issues with the other systems available in the user environment. It also discovers the non-functional issues such as load and performance defects in the actual user environment.

**Application**

**Advantages**

The advantages of the V-Model method are as follows −

- This is a highly-disciplined model and Phases are completed one at a time.

- Works well for smaller projects where requirements are very well understood.

- Simple and easy to understand and use.

- Easy to manage due to the rigidity of the model. Each phase has specific deliverables and a review process.

**Disadvantages**

The disadvantages of the V-Model method are as follows −

- High risk and uncertainty.

- Not a good model for complex and object-oriented projects.

- Poor model for long and ongoing projects.

- Not suitable for the projects where requirements are at a moderate to high risk of changing.

- Once an application is in the testing stage, it is difficult to go back and change a functionality.

- No working software is produced until late during the life cycle.