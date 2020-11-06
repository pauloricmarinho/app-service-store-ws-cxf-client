
package br.com.prmarinho.service.store.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.prmarinho.service.store.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DesabilitarProduto_QNAME = new QName("http://webservice.store.web.com.br/", "desabilitarProduto");
    private final static QName _DesabilitarProdutoResponse_QNAME = new QName("http://webservice.store.web.com.br/", "desabilitarProdutoResponse");
    private final static QName _BuscarJogo_QNAME = new QName("http://webservice.store.web.com.br/", "buscarJogo");
    private final static QName _ListarJogosResponse_QNAME = new QName("http://webservice.store.web.com.br/", "listarJogosResponse");
    private final static QName _BuscarJogoResponse_QNAME = new QName("http://webservice.store.web.com.br/", "buscarJogoResponse");
    private final static QName _ListarJogos_QNAME = new QName("http://webservice.store.web.com.br/", "listarJogos");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.prmarinho.service.store.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DesabilitarProdutoResponse }
     * 
     */
    public DesabilitarProdutoResponse createDesabilitarProdutoResponse() {
        return new DesabilitarProdutoResponse();
    }

    /**
     * Create an instance of {@link BuscarJogo }
     * 
     */
    public BuscarJogo createBuscarJogo() {
        return new BuscarJogo();
    }

    /**
     * Create an instance of {@link DesabilitarProduto }
     * 
     */
    public DesabilitarProduto createDesabilitarProduto() {
        return new DesabilitarProduto();
    }

    /**
     * Create an instance of {@link BuscarJogoResponse }
     * 
     */
    public BuscarJogoResponse createBuscarJogoResponse() {
        return new BuscarJogoResponse();
    }

    /**
     * Create an instance of {@link ListarJogos }
     * 
     */
    public ListarJogos createListarJogos() {
        return new ListarJogos();
    }

    /**
     * Create an instance of {@link ListarJogosResponse }
     * 
     */
    public ListarJogosResponse createListarJogosResponse() {
        return new ListarJogosResponse();
    }

    /**
     * Create an instance of {@link OutGameDTO }
     * 
     */
    public OutGameDTO createOutGameDTO() {
        return new OutGameDTO();
    }

    /**
     * Create an instance of {@link InGameDTO }
     * 
     */
    public InGameDTO createInGameDTO() {
        return new InGameDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DesabilitarProduto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.store.web.com.br/", name = "desabilitarProduto")
    public JAXBElement<DesabilitarProduto> createDesabilitarProduto(DesabilitarProduto value) {
        return new JAXBElement<DesabilitarProduto>(_DesabilitarProduto_QNAME, DesabilitarProduto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DesabilitarProdutoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.store.web.com.br/", name = "desabilitarProdutoResponse")
    public JAXBElement<DesabilitarProdutoResponse> createDesabilitarProdutoResponse(DesabilitarProdutoResponse value) {
        return new JAXBElement<DesabilitarProdutoResponse>(_DesabilitarProdutoResponse_QNAME, DesabilitarProdutoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarJogo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.store.web.com.br/", name = "buscarJogo")
    public JAXBElement<BuscarJogo> createBuscarJogo(BuscarJogo value) {
        return new JAXBElement<BuscarJogo>(_BuscarJogo_QNAME, BuscarJogo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarJogosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.store.web.com.br/", name = "listarJogosResponse")
    public JAXBElement<ListarJogosResponse> createListarJogosResponse(ListarJogosResponse value) {
        return new JAXBElement<ListarJogosResponse>(_ListarJogosResponse_QNAME, ListarJogosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarJogoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.store.web.com.br/", name = "buscarJogoResponse")
    public JAXBElement<BuscarJogoResponse> createBuscarJogoResponse(BuscarJogoResponse value) {
        return new JAXBElement<BuscarJogoResponse>(_BuscarJogoResponse_QNAME, BuscarJogoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarJogos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.store.web.com.br/", name = "listarJogos")
    public JAXBElement<ListarJogos> createListarJogos(ListarJogos value) {
        return new JAXBElement<ListarJogos>(_ListarJogos_QNAME, ListarJogos.class, null, value);
    }

}
