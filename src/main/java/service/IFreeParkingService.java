package service;

import model.ticket.Ticket;

public interface IFreeParkingService{
    // returns cost
    public double freeParking(Ticket ticket);
}
