package org.pattern.structural.facade;

class AnimalCareFacade {
    private FeedingService feedingService;
    private CleaningService cleaningService;
    private MedicalService medicalService;

    public AnimalCareFacade() {
        this.feedingService = new FeedingService();
        this.cleaningService = new CleaningService();
        this.medicalService = new MedicalService();
    }

    // Simplified method to take care of an animal
    public void takeCareOfAnimal() {
        System.out.println("Starting animal care process...");
        feedingService.feed();
        feedingService.giveWater();
        cleaningService.clean();
        cleaningService.groom();
        medicalService.checkHealth();
        medicalService.giveMedicine();
        System.out.println("Animal care process completed.");
    }

    // Simplified method for emergency medical care
    public void emergencyCare() {
        System.out.println("Starting emergency care...");
        medicalService.checkHealth();
        medicalService.giveMedicine();
        System.out.println("Emergency care completed.");
    }
}

