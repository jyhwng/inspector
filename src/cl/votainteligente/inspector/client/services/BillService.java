package cl.votainteligente.inspector.client.services;

import cl.votainteligente.inspector.model.Bill;
import cl.votainteligente.inspector.model.Category;
import cl.votainteligente.inspector.model.Parlamentarian;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import java.util.List;

@RemoteServiceRelativePath("gwtrpc/bill")
public interface BillService extends RemoteService {
	List<Bill> getAllBills() throws Exception;
	Bill getBill(Long billId) throws Exception;
	Bill saveBill(Bill bill) throws Exception;
	void deleteBill(Bill bill) throws Exception;
	List<Bill> searchBills(Parlamentarian parlamentarian, Category category) throws Exception;
}