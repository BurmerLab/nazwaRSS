/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.nazwa;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author Michał
 */
public class Blocks {
    private String title = "";
    private String href = "";
    private String description = "";
//Pobieranie div class = gridRow contentLevel2 default noThemeHeadline 
    //contentLevel12++
    
    public String getBT(int count) throws IOException{
       Document mast = Jsoup.connect("http://www.bt.no/").get();
       Elements master = mast.select("table.domains-market-table tbody tr:nth-of-type("+count+")");
       Element link = master.select("a").first();
//       this.title = link.text();
       return link.text();
    }
    
    public String foundTitle(int count) throws IOException{
        if(count == 0){return "Parametr funkcji nie moze byc rowny 0";}
        else{
            Document mast = Jsoup.connect("http://www.nazwa.pl/gielda-domen/najciekawsze-domeny/ostatnio-dodane/").get();
            Elements master = mast.select("table.domains-market-table tbody tr:nth-of-type("+count+")");
            Element link = master.select("a").first();
            this.title = link.text();
        }
        return title;
        
    }
    public String foundHref(int count) throws IOException{
        if(count == 0){return "Parametr funkcji nie moze byc rowny 0";}
        else{
            Document mast = Jsoup.connect("http://www.nazwa.pl/gielda-domen/najciekawsze-domeny/ostatnio-dodane/").get();
            Elements master = mast.select("table.domains-market-table tbody tr:nth-of-type("+count+")");
            Element link = master.select("a").first();
            href = link.attr("abs:href");
        }
        return href;
    }
    public String foundDescription(int count) throws IOException{
        if(count == 0){return "Parametr funkcji nie moze byc rowny 0";}
        else{
            Document mast = Jsoup.connect("http://www.nazwa.pl/gielda-domen/najciekawsze-domeny/ostatnio-dodane/").get();
            Elements master = mast.select("table.domains-market-table tbody tr:nth-of-type("+count+")");
            Elements descr = master.select("td:eq(2)");
            description = descr.text();
        }
        return description;
    }
}
