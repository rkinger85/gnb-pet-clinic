package com.gnb.gnbpetclinic.services;

import com.gnb.gnbpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);



}
