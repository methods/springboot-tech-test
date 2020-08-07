### Welcome

This is a Methods Business and Digital LTD Java + Spring boot assessment. This short assessment has been designed to test your skills in Java and springboot. You have 72 hrs to attempt the tasks listed below. Complete as many of the tasks, in order.


### Tasks

Before starting Task 1, below, ensure that you

1) Fork this repo
2) Grant access to Methods organisation, to be able to review the forked repo.
3) Raise a seperate pull request for each task. For task 5, create a pull request for each part.

### Task1: Change The pets image

On the home page there is an image of a cat and a dog, replace that image with the cat.png picture provided in the static/images folder.


### Task 2: Create a tab for listing pets

Create a listings page for all pets currently registered. So, the page options in the header should be ordered as below
    -	Home
    -	Find Owners
    -	Pets
    -	Veterinarians
    -	Error


### Task 3: Add functionality to add a Vet

Currently, there is no option of adding a vet. Please add a button to the ‘Veterinarians’ listing page which gives you the ability to add a new vet to the database.


### Task 4: Prevent Duplication of owners

An Owner can be created using the ‘Add Owner’ button on the ‘Find Owners’ page. Devise a mechanism to check that an entry for the owner doesn’t exist before the changes are commited to the DB. If an owner with similar details exists, prompt the user with an error “Duplicate entry, this owner already exists. Please use our ‘Find owner’ option to find this owner.”


### Task 5: Create a microservice

This task is broken down into 2 parts. Part A will be where you will create a listing page for all appointments. And Part B will be where you build the functionality for booking a new appointment.

This new service should be a seperate microservice. You can write this in any language but extra points will be awarded if written in python.

### 5a - Create an appointments listing page


-   Create a new 'Appointment' service. This service will list all the current appointments. Use dummy data to create a few appointments.
-   Integrate it into the petclinic app, accessed via a new tab in the page header. The header should now have the following items
    -	Home
    -	Find Owners
    -	Pets
    -	Veterinarians
    -	Error
    -   Appointments

### 5b - Add functionality to book an appointment

-   Add a new button on the 'Appointment' lisitng page which gives you the ability to add a new appointment.
