package company.model;


import lombok.Setter;

@Setter
public class Document {
    private Description description;
    private String docId;
    private String docStatus;
    private String docType;
    private boolean importRequest;
    private String ownerInn;
    private String participantInn;
    private String producerInn;
    private String productionDate;
    private String productionType;
    private Product[] products;
    private String regDate;
    private String regNumber;
}
