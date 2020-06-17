/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.messagemanagement.application;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.productionlinemanagement.domain.ProductionLine;
import eapli.base.productionlinemanagement.repositories.ProductionLineRepository;
import java.util.Date;

/**
 *
 * @author Bernardo Carvalho
 */
public class CheckLastMessageProcessingWasExecutedController {
    
    private final ProductionLineRepository productionLineRepo = PersistenceContext.repositories().productionLineRepository();
    
    public Date lastMessagesProcessingDate(ProductionLine productionLine) {
        
        return productionLine.lastMessageProcessingDate();
    }
    
}
