package pl.edu.amu.wmi.eryk.springbootplayground;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by erykmariankowski on 06.10.2018.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {SpringBootPlaygroundApplication.class})
@AutoConfigureRestDocs(outputDir = "build/asciidoc/snippets")
@AutoConfigureMockMvc
public class BookingControllerIT {

    @Autowired
    MockMvc mockMvc;

    @Transactional
    @Test
    public void shouldReturnErrorMessageInEnglish() throws Exception {
        MvcResult mvcResult = mockMvc
                .perform(get("/api/locale"))
                .andExpect(status().isOk())
                .andReturn();
        String contentAsString = mvcResult.getResponse().getContentAsString();
        Assert.assertEquals("en", contentAsString);
    }

}