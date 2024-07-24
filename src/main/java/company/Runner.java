package company;

import company.model.CrptApi;
import company.model.Description;
import company.model.Document;
import company.model.Product;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class Runner {

    public static void main(String[] args) throws IOException, InterruptedException {
        CrptApi api = new CrptApi(TimeUnit.SECONDS, 5);

        Document document = new Document();
        Description description = new Description();
        description.setParticipantInn("string");
        document.setDescription(description);
        document.setDocId("string");
        document.setDocStatus("string");
        document.setDocType("LP_INTRODUCE_GOODS");
        document.setImportRequest(true);
        document.setOwnerInn("string");
        document.setParticipantInn("string");
        document.setProducerInn("string");
        document.setProductionDate("2020-01-23");
        document.setProductionType("string");

        Product product = new Product();
        product.setCertificateDocument("string");
        product.setCertificateDocument_date("2020-01-23");
        product.setCertificateDocumentNumber("string");
        product.setOwnerInn("string");
        product.setProducerInn("string");
        product.setProductionDate("2020-01-23");
        product.setTnvedCode("string");
        product.setUitCode("string");
        product.setUituCode("string");

        document.setProducts(new Product[]{product});
        document.setRegDate("2020-01-23");
        document.setRegNumber("string");

        api.createDocument(document, "Qwerty123");
    }
}

