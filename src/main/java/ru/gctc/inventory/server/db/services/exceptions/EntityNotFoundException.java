package ru.gctc.inventory.server.db.services.exceptions;

public class EntityNotFoundException extends ServiceException {
    public EntityNotFoundException(String type, long id) {
        super(String.format("Entity %s #%d not found.", type, id));
    }
}