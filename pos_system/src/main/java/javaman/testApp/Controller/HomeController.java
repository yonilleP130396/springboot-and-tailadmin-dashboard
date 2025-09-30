package javaman.testApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/admin")
public class HomeController {

    @GetMapping("dashboard")
    public String getSidebar() {
        return "index";
    }

    @GetMapping("/analytics")
    public String getMainpage() {
        return "analytics";
    }
    @GetMapping("/marketing")
    public String marketing() {
        return "marketing";
    }

    @GetMapping("/stocks")
    public String getstocks() {
        return "stocks";
    }

    @GetMapping("/crm")
    public String getcrm() {
        return "crm";
    }
    @GetMapping("/saas")
    public String saas() {
        return "saas";
    }
    @GetMapping("/logistics")
    public String logistics() {
        return "logistics";
    }
    @GetMapping("/text-generator")
    public String text_generator() {
        return "text-generator";
    }
    @GetMapping("/image-generator")
    public String image_generator() {
        return "image-generator";
    }
    @GetMapping("/code-generator")
    public String code_generator() {
        return "code-generator";
    }
    @GetMapping("/video-generator")
    public String video_generator() {
        return "video-generator";
    }
    @GetMapping("/products-list")
    public String products_list() {
        return "products-list";
    }
    @GetMapping("/add-product")
    public String add_product() {
        return "add-product";
    }
    @GetMapping("/billing")
    public String billing() {
        return "billing";
    }
    @GetMapping("/invoices")
    public String invoices() {
        return "invoices";
    }
    @GetMapping("/single-invoice")
    public String single_invoice() {
        return "single-invoice";
    }
    @GetMapping("/create-invoice")
    public String create_invoice() {
        return "create-invoice";
    }
    @GetMapping("/transactions")
    public String transactions() {
        return "transactions";
    }
    @GetMapping("/single-transaction")
    public String single_transaction() {
        return "single-transaction";
    }
    @GetMapping("/calendar")
    public String calendar() {
        return "calendar";
    }
    @GetMapping("/profile")
    public String profile() {
        return "profile";
    }
    @GetMapping("/task-list")
    public String task_list() {
        return "task-list";
    }
    @GetMapping("/task-kanban")
    public String task_kanban() {
        return "task-kanban";
    }
    @GetMapping("/form-elements")
    public String form_elements() {
        return "form-elements";
    }
    @GetMapping("/form-layout")
    public String form_layout() {
        return "form-layout";
    }
    @GetMapping("/basic-tables")
    public String basic_tables() {
        return "basic-tables";
    }
    @GetMapping("/data-tables")
    public String data_tables() {
        return "data-tables";
    }
    @GetMapping("/file-manager")
    public String file_manager() {
        return "file-manager";
    }
    @GetMapping("/pricing-tables")
    public String pricing_tables() {
        return "pricing-tables";
    }
    @GetMapping("/faq")
    public String faq() {
        return "faq";
    }
    @GetMapping("/api-keys")
    public String api_keys() {
        return "api-keys";
    }
    @GetMapping("/integrations")
    public String integrations() {
        return "integrations";
    }
    @GetMapping("/blank")
    public String blank() {
        return "blank";
    }
    @GetMapping("/404")
    public String error404() {
        return "404";
    }
    @GetMapping("/500")
    public String error500() {
        return "500";
    }
    @GetMapping("/503")
    public String error503() {
        return "503";
    }
    

    @GetMapping("/coming-soon")
    public String coming_soon() {
        return "coming-soon";
    }
    @GetMapping("/maintenance")
    public String maintenance() {
        return "maintenance";
    }
    @GetMapping("/success")
    public String success() {
        return "success";
    }
   
    @GetMapping("/chat")
    public String chat() {
        return "chat";
    }
    @GetMapping("/support-tickets")
    public String support_tickets() {
        return "support-tickets";
    }
    @GetMapping("/support-ticket-reply")
    public String support_ticket_reply() {
        return "support-ticket-reply";
    }
    @GetMapping("/inbox")
    public String inbox() {
        return "inbox";
    }
    @GetMapping("/inbox-details")
    public String inbox_details() {
        return "inbox-details";
    }
    @GetMapping("/line-chart")
    public String line_chart() {
        return "line-chart";
    }
    @GetMapping("/bar-chart")
    public String bar_chart() {
        return "bar-chart";
    }
    @GetMapping("/pie-chart")
    public String pie_chart() {
        return "pie-chart";
    }
    @GetMapping("/alerts")
    public String alerts() {
        return "alerts";
    }
    @GetMapping("/avatars")
    public String avatars() {
        return "avatars";
    }
    @GetMapping("/badge")
    public String badge() {
        return "badge";
    }
    @GetMapping("/breadcrumb")
    public String breadcrumb() {
        return "breadcrumb";
    }
    @GetMapping("/buttons")
    public String buttons() {
        return "buttons";
    }
    @GetMapping("/buttons-group")
    public String buttons_group() {
        return "buttons-group";
    }
    @GetMapping("/cards")
    public String cards() {
        return "cards";
    }
    @GetMapping("/carousel")
    public String carousel() {
        return "carousel";
    }
    @GetMapping("/dropdowns")
    public String dropdowns() {
        return "dropdowns";
    }
    @GetMapping("/images")
    public String images() {
        return "images";
    }
    @GetMapping("/links")
    public String links() {
        return "links";
    }
    @GetMapping("/list")
    public String list() {
        return "list";
    }
    @GetMapping("/modals")
    public String modals() {
        return "modals";
    }
    @GetMapping("/notifications")
    public String notifications() {
        return "notifications";
    }
    @GetMapping("/pagination")
    public String pagination() {
        return "pagination";
    }
    @GetMapping("/popovers")
    public String popovers() {
        return "popovers";
    }
    @GetMapping("/progress-bar")
    public String progress_bar() {
        return "progress-bar";
    }
    @GetMapping("/ribbons")
    public String ribbons() {
        return "ribbons";
    }

    @GetMapping("/spinners")
    public String spinners() {
        return "spinners";
    }
    @GetMapping("/tabs")
    public String tabs() {
        return "tabs";
    }
    @GetMapping("/tooltips")
    public String tooltips() {
        return "tooltips";
    }
    @GetMapping("/videos")
    public String videos() {
        return "videos";
    }
    @GetMapping("/reset-password")
    public String resetpassword() {
        return "reset-password";
    }
    @GetMapping("/two-step-verification")
    public String twostepverification() {
        return "two-step-verification";
    }
    

}
