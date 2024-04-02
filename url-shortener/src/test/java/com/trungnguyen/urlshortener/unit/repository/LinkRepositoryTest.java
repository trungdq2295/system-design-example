package com.trungnguyen.urlshortener.unit.repository;


import com.trungnguyen.urlshortener.configuration.MongoDBTestConfiguration;
import com.trungnguyen.urlshortener.constant.FakeConstant;
import com.trungnguyen.urlshortener.model.Link;
import com.trungnguyen.urlshortener.repository.LinkRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@DataMongoTest
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {MongoDBTestConfiguration.class})
public class LinkRepositoryTest {


    @Autowired
    LinkRepository linkRepository;


    @Test
    public void givenWhenUserInputLongUrl_whenSave() {
        Link link = new Link();
        link.setId("123");
        link.setShortUrl(FakeConstant.SHORT_URL);
        link.setLongUrl(FakeConstant.LONG_URL);
        link.setAccessTime(1);
        Link savedLink = linkRepository.insert(link);
        Assert.assertEquals(link.getShortUrl(), savedLink.getShortUrl());
        Assert.assertEquals(1, savedLink.getAccessTime());
    }
}
